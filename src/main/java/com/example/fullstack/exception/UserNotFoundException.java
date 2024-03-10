package com.example.fullstack.exception;

public class UserNotFoundException extends  RuntimeException{
    public UserNotFoundException(Long id){
        super("Could not find user with this id"+id);
    }
}
