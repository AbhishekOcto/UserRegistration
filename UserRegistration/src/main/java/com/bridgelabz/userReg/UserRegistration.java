package com.bridgelabz.userReg;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
   static Scanner sc = new Scanner(System.in);

    public void validfirstName() {
        System.out.print("Enter First Name: ");
        String firstName = sc.next();
        boolean result = Pattern.matches("[A-Z][a-z]{2,}", firstName);
        //First name starts with Cap and has minimum 3 characters
        if (result) {
            System.out.println("Success");
        } else {
            System.out.println("Please enter valid first name");
        }
        System.out.println("First name is: " + firstName);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to user registration program");
        UserRegistration userReg = new UserRegistration();
        int option;
        while (true) {
            System.out.print("1.First Name\n2.Exit");
            System.out.println("\nEnter option number: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    userReg.validfirstName();
                    break;
                case 2:
                    System.exit(0);
                    break;
            }
        }
    }
}
