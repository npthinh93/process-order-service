package com.digital.processorderservice.handler.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class BaseRuntimeException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private String code;
    private String message;
    private Object data;

    public BaseRuntimeException(String message) {
        this.message = message;
    }

    public BaseRuntimeException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public BaseRuntimeException(String code, String message, Object data) {
        super(message);
        this.code = code;
        this.message = message;
        this.data = data;
    }

}
