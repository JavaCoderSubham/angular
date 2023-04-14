package com.spring.repo.exception;

import com.spring.repo.entity.ErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorResponse> userNotFoundException(UserNotFoundException ex) {

        log.error("userNotFoundException(UserNotFoundException) -> | Exception Message : {}",ex.getMessage());
        ErrorResponse error = ErrorResponse
                .builder()
                .errorMessage(ex.getMessage())
                .errorStatus(HttpStatus.NOT_FOUND)
                .build();

        log.error("userNotFoundException(UserNotFoundException) -> | ErrorResponse : {}",error);

        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(error);
    }


}
