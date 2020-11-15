package org.kodluyoruz.examples.exceptions;

public class UserService {

    private static String userPasswordInDB = "12345";

    public static boolean checkUserPassword(String password)
            throws InvalidPasswordException {
        if (password.equals(userPasswordInDB)) {
            return true;
        } else {
            throw new InvalidPasswordException();
        }
    }
}
