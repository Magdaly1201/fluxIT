/**
 * 
 */
package ar.com.fluxit.candidates.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ar.com.fluxit.candidates.exception.AuthenticationFailedException;
import ar.com.fluxit.candidates.model.jwt.UserJWT;
import ar.com.fluxit.candidates.model.jwt.UserLoginDTO;
import ar.com.fluxit.candidates.security.GeneratorJWT;
import ar.com.fluxit.candidates.service.IUserService;

/**
 * @author Magdaly Santos
 *
 */
@Controller
public class AuthenticationController {

	@Autowired
	private GeneratorJWT generator;
	
	@Autowired
	private IUserService userService;
	
	/**
	 * metodo generador del jwt con {@link Login} username y password
	 * @param login
	 * @return String jwt 
	 * @throws AuthenticationFailedException
	 */
	public String generator(UserLoginDTO login) throws AuthenticationFailedException {
		UserJWT userJWT = this.userService.existUser(login);
		return this.generator.generate(userJWT);
	}
	
}
