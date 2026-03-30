package org.example.demo_spring_data_jpa.exception;

public class DuplicateAdmin extends Exception{
    public DuplicateAdmin(String message) {
        super(message);
    }
}
