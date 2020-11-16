package ar.com.fluxit.candidates.service;

import ar.com.fluxit.candidates.exception.AuthenticationFailedException;
import ar.com.fluxit.candidates.model.jwt.UserLoginDTO;

public interface IAuthenticationService {

	String generateJwt(UserLoginDTO login) throws AuthenticationFailedException;

}