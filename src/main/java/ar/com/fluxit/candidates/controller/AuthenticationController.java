/**
 * 
 */
package ar.com.fluxit.candidates.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import ar.com.fluxit.candidates.model.jwt.UserLoginDTO;

/**
 * @author Magdaly Santos
 *
 */
@Controller
public class AuthenticationController {

	public String generator(UserLoginDTO login) {
		return null;
	}
	
}
