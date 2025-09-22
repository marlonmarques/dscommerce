package com.devsuperior.dscommerce.services.excepitos;

public class DatabaseException extends RuntimeException {

    public DatabaseException(String msg){
        super(msg);
    }
}
