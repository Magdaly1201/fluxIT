/**
 * 
 */
package ar.com.fluxit.candidates.exception;

import ar.com.fluxit.candidates.codes.ExceptionCodes;

/**
 * @author Magdaly Santos
 *
 */
public class AuthenticationFailedException extends CustomException{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -856728934136263657L;
	private static final ExceptionCodes exceptionCode = ExceptionCodes.USERNAME_PASSWORD_NO_MATCH;	
	
	public AuthenticationFailedException() {
		super(exceptionCode.getCode(), exceptionCode.getUserMessage(), exceptionCode.getSystemMessage());
	}
}
