package org.kodluyoruz.examples.exceptions;

public class InvalidPasswordException extends Exception {

    public InvalidPasswordException() {
        super("Kullanıcın şifresi hatalıdır");
    }
}
