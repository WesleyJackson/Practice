package com.company;

import com.company.PasswordGenerator.PasswordGenerator;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i ++){
            System.out.println(args[i]);
        }

        PasswordGenerator myPassword = new PasswordGenerator();
        System.out.println("Generated password: " + myPassword.makePassword());
    }
}
