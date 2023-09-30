package org.example.exceptions;

public class SqlException extends RuntimeException {
    public SqlException(String message) {
        super(message);
    }
}
