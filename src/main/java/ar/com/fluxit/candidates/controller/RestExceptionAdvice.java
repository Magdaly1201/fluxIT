package ar.com.fluxit.candidates.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException.BadRequest;

import ar.com.fluxit.candidates.exception.CandidateNotFoundException;
import ar.com.fluxit.candidates.model.dto.CandidateResponseDTO;


@ControllerAdvice
public class RestExceptionAdvice {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	
	@ExceptionHandler(CandidateNotFoundException.class)
	@ResponseBody
	public ResponseEntity<Map<String, Object>> carResponseExceptionHanlder(CandidateNotFoundException ex) {
		Map<String, Object> response = new HashMap<>();
		String className = ex.getStackTrace()[0].getClassName();
		int line = ex.getStackTrace()[0].getLineNumber();
		logger.error("Exception: "+ex.getMessage()+ " - Class: "+className +" - line: "+ line);
		response.put("errors", ex.getMessage());
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
	
}