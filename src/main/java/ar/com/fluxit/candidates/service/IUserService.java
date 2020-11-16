/**
 * 
 */
package ar.com.fluxit.candidates.service;

import ar.com.fluxit.candidates.exception.AuthenticationFailedException;
import ar.com.fluxit.candidates.model.jwt.UserJWT;
import ar.com.fluxit.candidates.model.jwt.UserLoginDTO;

/**
 * @author mxs690
 *
 */
public interface IUserService {

	UserJWT existUser(UserLoginDTO login) throws AuthenticationFailedException;

}
