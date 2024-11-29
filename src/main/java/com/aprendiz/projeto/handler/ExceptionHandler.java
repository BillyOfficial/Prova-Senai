package com.aprendiz.projeto.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandler {
	
	@ResponseStatus (HttpStatus.NOT_FOUND)
	@ResponseBody
	@org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
	public String usuarionaoencontrado (Exception e) {
		return e.getMessage();
	}

}
