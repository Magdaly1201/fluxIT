/**
 * 
 */
package ar.com.fluxit.candidates.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.fluxit.candidates.model.dto.CandidateResponseDTO;
import ar.com.fluxit.candidates.model.jwt.UserLoginDTO;
import ar.com.fluxit.candidates.security.GeneratorJWT;
import constant.JwtConstants;

/**
 * @author Magdaly Santos
 *
 */
@RestController
@RequestMapping("/token")
public class AuthenticationRestController {

	@Autowired 
	private AuthenticationController authController;
	

		
	@PostMapping
	public ResponseEntity<?> generate(@Valid @RequestBody final UserLoginDTO login) {
		String token = authController.generator(login);
		return new ResponseEntity<String>(JwtConstants.BEARER_TOKEN.concat(token), HttpStatus.OK);

	}
	

}
