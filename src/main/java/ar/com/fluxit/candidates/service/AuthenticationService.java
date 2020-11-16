/**
 * 
 */
package ar.com.fluxit.candidates.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ar.com.fluxit.candidates.exception.AuthenticationFailedException;
import ar.com.fluxit.candidates.model.jwt.UserJWT;
import ar.com.fluxit.candidates.model.jwt.UserLoginDTO;
import ar.com.fluxit.candidates.security.GeneratorJWT;

/**
 * @author Magdaly Santos
 *
 */
@Service
public class AuthenticationService implements IAuthenticationService {

	@Autowired
	private IUserService userService;
	
	@Autowired
	private GeneratorJWT generatorJWT;
	
	@Override
	public String generateJwt(UserLoginDTO login) throws AuthenticationFailedException {
		UserJWT userJWT = this.userService.existUser(login);
		return generatorJWT.generate(userJWT);
	}
	

	
}
