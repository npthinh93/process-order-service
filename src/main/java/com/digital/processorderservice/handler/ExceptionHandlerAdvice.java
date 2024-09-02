package com.digital.processorderservice.handler;

import com.digital.processorderservice.handler.exception.NotFoundException;
import com.digital.processorderservice.model.BaseMetadata;
import com.digital.processorderservice.model.BaseResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<BaseResponse> handle(HttpServletRequest request, Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(BaseResponse.builder().build());
    }

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<BaseResponse> handle(HttpServletRequest request, NotFoundException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(BaseResponse.builder()
                .meta(BaseMetadata.builder()
                        .code(e.getCode())
                        .message(e.getMessage())
                        .build())
                .build());
    }
}
