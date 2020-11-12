package ar.com.fluxit.candidates.controller;

import java.util.ArrayList;
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


@ControllerAdvice
public class RestExceptionAdvice {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
//	
//	@ExceptionHandler(CarNotFoundException.class)
//	@ResponseBody
//	@ResponseStatus(HttpStatus.NOT_FOUND)
//	public ResponseEntity<?> carResponseExceptionHanlder(CarNotFoundException ex) {
//		String className = ex.getStackTrace()[0].getClassName();
//		int line = ex.getStackTrace()[0].getLineNumber();
//		logger.error("Exception: "+ex.getMessage()+ " - Class: "+className +" - line: "+ line);
//		this.responseBusiness.loadError(404, ex.getMessage(), ex.getMessage());
//		return this.responseBusiness.getOutput();
//	}
//
//	//BindException
//	@ResponseStatus(HttpStatus.BAD_REQUEST)
//	@ResponseBody
//	@ExceptionHandler(BindException.class)
//	public Response handleBindException(BindException ex) {
//		
//		List<String> errors = new ArrayList<String>();
//	    for (FieldError error : ex.getBindingResult().getFieldErrors()) {
//	        errors.add(error.getField() + ": " + error.getDefaultMessage());
//	        
//	        this.responseBusiness.loadError(Integer.parseInt(error.getCode()), error.getField() +" -"+ error.getDefaultMessage() , error.getField() +" -"+ error.getDefaultMessage());
//	    }
//	    for (ObjectError error : ex.getBindingResult().getGlobalErrors()) {
//	        errors.add(error.getObjectName() + ": " + error.getDefaultMessage());
//	        
//	        System.out.println("error.getObjectName() "+error.getObjectName());
//	        System.out.println("error.getDefaultMessage() "+error.getDefaultMessage());
//	        this.responseBusiness.loadError(/*error.getCode()*/1, error.getObjectName() +" -"+ error.getDefaultMessage() , error.getObjectName() +" -"+ error.getDefaultMessage());
//	    }    
//	    return this.responseBusiness.getOutput();
//	}
//	
	
}