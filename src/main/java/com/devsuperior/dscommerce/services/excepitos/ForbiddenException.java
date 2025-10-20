package com.devsuperior.dscommerce.services.excepitos;

public class ForbiddenException extends RuntimeException {

    public ForbiddenException(String msg){
        super(msg);
    }
}
