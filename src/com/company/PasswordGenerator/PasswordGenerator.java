package com.company.PasswordGenerator;

import java.util.Random;

public class PasswordGenerator {
    private static final String characters = "0)1!2@3#4$5%6^7&8*9(aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ";

    public static String makePassword(int passwordLength) {
        String password = "";
        Random rand = new Random();

        for (int i = 0; i < passwordLength; i ++){
            password += characters.charAt(rand.nextInt(characters.length()));
        }

        return password;
    }
}
