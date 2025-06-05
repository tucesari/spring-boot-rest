package com.tuce.template.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

  @ResponseBody
  @ExceptionHandler(RuntimeException.class)
  public ResponseEntity<ApiError> handleConstraintViolationException(RuntimeException exception) {
    ApiError error = new ApiError(HttpStatus.BAD_REQUEST.toString(), HttpStatus.BAD_REQUEST.value(),
        "Runtime exception occurred: " + exception.getMessage());
    return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
  }
}