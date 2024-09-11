package com.construcao.software.formApi.exception.custom;


public final class PessoaNotFoundException extends ApplicationException {

    public PessoaNotFoundException(String message) {
        super(message);
    }

    public PessoaNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}