package com.nagarro.exceptions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import javax.net.ssl.SSLHandshakeException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import com.nagarro.payloads.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	LocalDateTime currentTime = LocalDateTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss", Locale.ENGLISH);

	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<ApiResponse> resourceNotFoundExceptionHandler(IllegalArgumentException ex) {
		String message = ex.getMessage();
		ApiResponse apiResponse = new ApiResponse(message, "400", currentTime.format(formatter));
		return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(SSLHandshakeException.class)
	public ResponseEntity<ApiResponse> handleSSLHandshakeException(SSLHandshakeException ex) {
		String message = ex.getMessage();
		ApiResponse apiResponse = new ApiResponse(message, "500", currentTime.format(formatter));
		return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ResponseEntity<ApiResponse> handleMethodArgumentTypeMismatchException(
			MethodArgumentTypeMismatchException ex) {
		String message = ex.getMessage();
		ApiResponse apiResponse = new ApiResponse(message, "500", currentTime.format(formatter));
		return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.NOT_FOUND);
	}
}
