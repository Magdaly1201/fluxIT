/**
 * 
 */
package ar.com.fluxit.candidates.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import ar.com.fluxit.candidates.exception.AuthenticationFailedException;
import ar.com.fluxit.candidates.model.IUser;
import ar.com.fluxit.candidates.model.dto.UserRequestDTO;
import ar.com.fluxit.candidates.model.jwt.UserJWT;
import ar.com.fluxit.candidates.model.jwt.UserLoginDTO;

/**
 * @author mxs690
 *
 */
public interface IUserService {

	UserJWT existUser(UserLoginDTO login) throws AuthenticationFailedException;

	IUser create(UserRequestDTO userRequestDTO);
	
	Page<IUser> all(PageRequest pageRequest);
	
}
