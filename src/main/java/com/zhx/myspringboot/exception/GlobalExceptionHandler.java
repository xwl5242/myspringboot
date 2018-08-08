package com.zhx.myspringboot.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler
	public String globalExceptionJson(Exception e){
		return "golbalExcpetionJson";
	}
}
