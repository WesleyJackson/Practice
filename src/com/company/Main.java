package com.company;

import com.company.PasswordGenerator.PasswordGenerator;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i ++){
            System.out.println(args[i]);
        }

        System.out.println("Generated password: " + PasswordGenerator.makePassword());
    }
}
