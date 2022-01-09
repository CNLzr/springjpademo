package com.example.springjpademo.exceptions;

public class StudentNonExistIdException extends RuntimeException {
    public StudentNonExistIdException(String message) {
        super(message);
    }
}
