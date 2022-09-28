package com.bridgelabz.userReg;
import java.util.Scanner;

import java.util.regex.Pattern;

public class UserRegistrationCheck {
    boolean check;
    //firstName Function
    public boolean firstName(String firstName) {
        check = Pattern.matches("[A-Z][a-z]{3,}",firstName);
        System.out.println("Please Enter Valid First Name");
        System.out.println(firstName);
        System.out.println(check);
        try{
            if (check != true){
                throw new InvalidRegistrationException("Invalid First Name\nPlease Check and Enter");
            }
        }
        catch (InvalidRegistrationException e){
            System.out.println(e.getMessage());
        }
        return  check;
    }
    //LastName Function
    public boolean lastName(String lastName) {
        check = Pattern.matches("[A-Z][a-z]{3,}", lastName);
        System.out.println("Please Enter Valid Last Name");
        System.out.println(lastName);
        System.out.println(check);
        try{
            if (check != true){
                throw new InvalidRegistrationException("Invalid Last Name\nPlease Check and Enter");
            }
        }
        catch (InvalidRegistrationException e){
            System.out.println(e.getMessage());
        }

        return check;
    }
    //Email Function
    public boolean email(String email) {
        check = Pattern.matches("[a-z]*.[a-z]*@[b]+[l]+.[c]+[o]+.[i]+[n]+", email);
        System.out.println("Please Enter Valid Email");
        System.out.println(email);
        System.out.println(check);
        try{
            if (check != true){
                throw new InvalidRegistrationException("Invalid Email Address\nPlease Check and Enter");
            }
        }
        catch (InvalidRegistrationException e){
            System.out.println(e.getMessage());
        }

        return check;
    }
    //Mobile Number Function
    public boolean mobileNumber(String number) {
        check = Pattern.matches("[0-9]{2}[\\s]+[0-9]{10}", number);
        System.out.println("Please Enter Valid Mobile Number");
        System.out.println(number);
        System.out.println(check);
        try{
            if (check != true){
                throw new InvalidRegistrationException("Invalid Mobile Number\nPlease Check and Enter");
            }
        }
        catch (InvalidRegistrationException e){
            System.out.println(e.getMessage());
        }

        return check;
    }
    //password Function
    public boolean password(String password) {
        check = Pattern.matches("[A-Z]+[A-z0-9]{6,}[@]+[0-9]+", password);
        System.out.println("Please Enter Valid Password");
        System.out.println(password);
        System.out.println(check);
        try{
            if (check != true){
                throw new InvalidRegistrationException("Invalid Password\nPlease Check and Enter");
            }
        }
        catch (InvalidRegistrationException e){
            System.out.println(e.getMessage());
        }

        return check;
    }
    public boolean emailsCheck(String emails){
        check = Pattern.matches("[A-z0-9.]*[.+-]?[A-z0-9.]*[@]+[a-z0-9]*[.]+[a-z]{2,}([.]+[a-z]{2,})?", emails);
        System.out.println("Please Enter Sample Emails Given");
        System.out.println(emails);
        System.out.println(check);
        try{
            if (check != true){
                throw new InvalidRegistrationException("Invalid email\nPlease Check and Enter");
            }
        }
        catch (InvalidRegistrationException e){
            System.out.println(e.getMessage());
        }

        return check;
    }
}
