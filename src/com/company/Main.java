package com.company;

import com.company.PasswordGenerator.PasswordGenerator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        for (int i = 0; i < args.length; i ++){
//            System.out.println(args[i]);
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the length of your desired password: ");
        int passwordLength = Integer.parseInt(scanner.nextLine());
        System.out.println("Generated password: " + PasswordGenerator.makePassword(passwordLength));
    }
}
