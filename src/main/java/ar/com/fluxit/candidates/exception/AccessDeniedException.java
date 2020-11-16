package ar.com.fluxit.candidates.exception;

import ar.com.fluxit.candidates.codes.ExceptionCodes;

public class AccessDeniedException extends CustomException {

	private static final long serialVersionUID = -50510158400280774L;
	private static final ExceptionCodes exceptionCode = ExceptionCodes.ACCESS_DENIED;

	public AccessDeniedException() {
		super(exceptionCode.getCode(), exceptionCode.getUserMessage(), exceptionCode.getSystemMessage());
	}
}
