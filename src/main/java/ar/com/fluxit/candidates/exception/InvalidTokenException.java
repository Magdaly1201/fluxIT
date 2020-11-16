package ar.com.fluxit.candidates.exception;

import ar.com.fluxit.candidates.codes.ExceptionCodes;

public class InvalidTokenException extends CustomException {

	private static final long serialVersionUID = -791005139316714970L;
	private static final ExceptionCodes exceptionCode = ExceptionCodes.INVALID_TOKEN;

	public InvalidTokenException() {
		super(exceptionCode.getCode(), exceptionCode.getUserMessage(), exceptionCode.getSystemMessage());
	}

}
