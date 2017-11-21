package com.company.PasswordGenerator;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    private static String password = "";
    private static final String characters = "0)1!2@3#4$5%6^7&8*9(aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ";

    public static String makePassword() {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Please enter the length of your desired password: ");
        int passwordLength = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < passwordLength; i ++){
            password += characters.charAt(rand.nextInt(characters.length()));
        }
        return password;
    }
}
