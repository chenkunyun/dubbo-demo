package com.kchen.dubbo.demo.api.service.entity;

public class AccountException extends Exception {

    private static final long serialVersionUID = -1355200585155963732L;

    public AccountException(String message, Throwable cause) {
        super(message, cause);
    }

    public AccountException(String message) {
        super(message);
    }
}
