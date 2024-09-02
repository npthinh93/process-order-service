package com.digital.processorderservice.handler.exception;

import com.digital.processorderservice.entity.BaseEntity;

public class NotFoundException extends BaseRuntimeException {
    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String code, String message) {
        super(code, message);
    }

    public NotFoundException(String code, String message, Object data) {
        super(code, message, data);
    }
}
