/**
 * 
 */
package ar.com.fluxit.candidates.service;

import java.time.LocalDateTime;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import ar.com.fluxit.candidates.entity.User;
import ar.com.fluxit.candidates.exception.AuthenticationFailedException;
import ar.com.fluxit.candidates.model.IUser;
import ar.com.fluxit.candidates.model.dto.UserRequestDTO;
import ar.com.fluxit.candidates.model.jwt.UserJWT;
import ar.com.fluxit.candidates.model.jwt.UserLoginDTO;
import ar.com.fluxit.candidates.repository.IUserRepository;

/**
 * @author Magdaly Santos
 *
 */
@Service
public class UserService implements IUserService {

	@Autowired
	private IUserRepository repository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public UserJWT existUser(UserLoginDTO login) throws AuthenticationFailedException {
		IUser userfind = repository.findByUsernameAndPassword(login.getUsername(), login.getPassword()).orElseThrow(()-> new AuthenticationFailedException());
		UserJWT userJWT = new UserJWT();
		this.modelMapper.map(userfind, userJWT);
		return userJWT;
	}

	@Override
	public IUser create(UserRequestDTO userRequestDTO) {
		User userSave = this.modelMapper.map(userRequestDTO, User.class);
		userSave.setCreateAt(LocalDateTime.now());
		return this.repository.save(userSave);
	}

	@Override
	public Page<IUser> all(PageRequest pageRequest) {
		return this.repository.findAll(pageRequest).map(d->d);
	}
}
