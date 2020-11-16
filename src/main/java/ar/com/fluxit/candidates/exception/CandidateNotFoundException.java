/**
 * 
 */
package ar.com.fluxit.candidates.exception;

import ar.com.fluxit.candidates.codes.ExceptionCodes;

/**
 * @author Magdaly Santos
 *
 */
public class CandidateNotFoundException extends CustomException {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3777172589601629098L;
	private static final ExceptionCodes exceptionCode = ExceptionCodes.CANDIDATE_NOT_FOUND;	
	
	public CandidateNotFoundException() {
		super(exceptionCode.getCode(), exceptionCode.getUserMessage(), exceptionCode.getSystemMessage());
	}
	
}
