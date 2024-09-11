package com.construcao.software.formApi.exception.custom;

public sealed class ApplicationException extends RuntimeException
        permits PessoaNotFoundException {

    public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }
}
