package ar.com.fluxit.candidates.exception;

import ar.com.fluxit.candidates.codes.ExceptionCodes;

public class MissingTokenException extends CustomException {

	private static final long serialVersionUID = -7001536940944730366L;
	private static final ExceptionCodes exceptionCode = ExceptionCodes.MISSING_TOKEN;

	public MissingTokenException() {
		super(exceptionCode.getCode(), exceptionCode.getUserMessage(), exceptionCode.getSystemMessage());
	}
}
