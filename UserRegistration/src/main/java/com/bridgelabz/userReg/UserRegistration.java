package com.bridgelabz.userReg;
import java.util.Scanner;
import java.util.regex.*;
/*
* @author - ABHISHEK
* since - 08.09.2022
* */

public class UserRegistration {
   static Scanner sc = new Scanner(System.in);

    //firstName Function
    public boolean firstName(String firstName){
        System.out.println("Please Enter Valid First Name");
        System.out.println(firstName);
        System.out.println(Pattern.matches("[A-Z][a-z]{3,}",firstName));
        return  Pattern.matches("[A-Z][a-z]{3,}",firstName);
    }
    //LastName Function
    public boolean lastName(String lastName) {
        System.out.println("Please Enter Valid Last Name");
        System.out.println(lastName);
        System.out.println(Pattern.matches("[A-Z][a-z]{3,}", lastName));

        return Pattern.matches("[A-Z][a-z]{3,}", lastName);
    }
    //Email Function
    public boolean email(String email) {
        System.out.println("Please Enter Valid Email");
        System.out.println(email);
        System.out.println(Pattern.matches("[A-z0-9]*(?=.*?[A-z])(?=.*\\W).*$", email));
        return Pattern.matches("[A-z0-9]*(?=.*?[A-z])(?=.*\\W).*$", email);
    }
    //Mobile Number Function
    public boolean mobileNumber(String number) {
        System.out.println("Please Enter Valid Mobile Number");
        System.out.println(number);
        System.out.println(Pattern.matches("[0-9]{2}[\\s]+[0-9]{10}", number));
        return (Pattern.matches("[0-9]{2}[\s]+[0-9]{10}", number));
    }
    //password Function
    public boolean password(String password) {
        System.out.println("Please Enter Valid Password");
        System.out.println(password);
        System.out.println(Pattern.matches("^(?=.*[A-z])(?=.*\\d)(?=.*[@#$%^&*()-+=])([a-zA-Z\\d@._-]).{8,}$", password));
        return Pattern.matches("^(?=.*[A-z])(?=.*\\d)(?=.*[@#$%^&*()-+=])([a-zA-Z\\d@._-]).{8,}$", password);
    }
    //eMail check Function
    public boolean emailsCheck(){
        System.out.println("Please Enter Sample Emails Given");
        String emails = "xyz@gmail.com";
        System.out.println(emails);
        System.out.println(Pattern.matches("[A-z0-9.]*[.+-]?[A-z0-9.]*[@]+[a-z0-9]*[.]+[a-z]{2,}([.]+[a-z]{2,})?", emails));
        return Pattern.matches("[A-z0-9.]*[.+-]?[A-z0-9.]*[@]+[a-z0-9]*[.]+[a-z]{2,}([.]+[a-z]{2,})?", emails);
    }
}
