package ar.com.fluxit.candidates.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import ar.com.fluxit.candidates.exception.AccessDeniedException;
import ar.com.fluxit.candidates.exception.AuthenticationFailedException;
import ar.com.fluxit.candidates.exception.CandidateNotFoundException;
import ar.com.fluxit.candidates.exception.InvalidTokenException;
import ar.com.fluxit.candidates.exception.MissingTokenException;

/**
 * Handle para capturar exception y mapearlas a un objeto con mensaje de error , mensaje de usuario y mensaje de sistema
 * @author Magdaly Santos
 *
 */
@ControllerAdvice
public class RestExceptionAdvice {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	
	@ExceptionHandler(CandidateNotFoundException.class)
	@ResponseBody
	public ResponseEntity<Map<String, Object>> candidateExceptionHandle(CandidateNotFoundException ex) {
		Map<String, Object> response = new HashMap<>();
		String className = ex.getStackTrace()[0].getClassName();
		int line = ex.getStackTrace()[0].getLineNumber();
		logger.error("Exception: "+ex.getUserMessage()+ " - Class: "+className +" - line: "+ line);
		response.put("errors", ex.getCode()+" - "+ex.getUserMessage());
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);

	}

	@ResponseBody
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, Object>> handleValidation(MethodArgumentNotValidException ex){
		Map<String, Object> response = new HashMap<>();
		if(ex.getBindingResult().hasErrors()) {
		List<String> errors = ex.getBindingResult().getFieldErrors()
				.stream()
				.map(err ->{
					return "El campo  : '"+ err.getField() +"' "+err.getDefaultMessage();
				})
				.collect(Collectors.toList());
		response.put("errors", errors);
		}
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(AccessDeniedException.class)
	@ResponseBody
	public ResponseEntity<Map<String, Object>> accessDeniedException(AccessDeniedException ex) {
		Map<String, Object> response = new HashMap<>();
		String className = ex.getStackTrace()[0].getClassName();
		int line = ex.getStackTrace()[0].getLineNumber();
		logger.error("Exception: "+ex.getUserMessage()+ " - Class: "+className +" - line: "+ line);
		response.put("errors", ex.getCode()+" - "+ex.getUserMessage());
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.FORBIDDEN);
	}

	@ExceptionHandler(InvalidTokenException.class)
	@ResponseBody
	public ResponseEntity<Map<String, Object>> invalidTokenException(InvalidTokenException ex) {
		Map<String, Object> response = new HashMap<>();
		String className = ex.getStackTrace()[0].getClassName();
		int line = ex.getStackTrace()[0].getLineNumber();
		logger.error("Exception: "+ex.getUserMessage()+ " - Class: "+className +" - line: "+ line);
		response.put("errors", ex.getCode()+" - "+ex.getUserMessage());
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.FORBIDDEN);
	}
	
	@ExceptionHandler(MissingTokenException.class)
	@ResponseBody
	public ResponseEntity<Map<String, Object>> missingTokenExceptionException(MissingTokenException ex) {
		Map<String, Object> response = new HashMap<>();
		String className = ex.getStackTrace()[0].getClassName();
		int line = ex.getStackTrace()[0].getLineNumber();
		logger.error("Exception: "+ex.getUserMessage()+ " - Class: "+className +" - line: "+ line);
		response.put("errors", ex.getCode()+" - "+ex.getUserMessage());
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.UNAUTHORIZED);
	}
	
	@ExceptionHandler(HttpMessageNotReadableException.class)
	@ResponseBody
	public ResponseEntity<Map<String, Object>> httpMessageNotReadableExceptionException(HttpMessageNotReadableException ex) {
		Map<String, Object> response = new HashMap<>();
		String className = ex.getStackTrace()[0].getClassName();
		int line = ex.getStackTrace()[0].getLineNumber();
		logger.error("Exception: "+ex.getMessage()+ " - Class: "+className +" - line: "+ line);
		response.put("errors","400 - Solicitud de Json sin el formato");
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(AuthenticationFailedException.class)
	@ResponseBody
	public ResponseEntity<Map<String, Object>> authenticationFailedException(AuthenticationFailedException ex) {
		Map<String, Object> response = new HashMap<>();
		String className = ex.getStackTrace()[0].getClassName();
		int line = ex.getStackTrace()[0].getLineNumber();
		logger.error("Exception: "+ex.getUserMessage()+ " - Class: "+className +" - line: "+ line);
		response.put("errors", ex.getCode()+" - "+ex.getUserMessage());
		return new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
	}
	
}