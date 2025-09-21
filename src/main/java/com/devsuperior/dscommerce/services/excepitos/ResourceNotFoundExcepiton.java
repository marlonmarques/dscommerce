package com.devsuperior.dscommerce.services.excepitos;

public class ResourceNotFoundExcepiton extends RuntimeException {

    public ResourceNotFoundExcepiton(String msg){
        super(msg);
    }
}
