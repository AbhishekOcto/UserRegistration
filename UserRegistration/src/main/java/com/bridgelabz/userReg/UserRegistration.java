package com.bridgelabz.userReg;
import java.util.Scanner;
import java.util.regex.*;
/*
* @author - ABHISHEK
* since - 07.09.2022
* */

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

    public void validLastName(){
        System.out.print("Enter Last Name: " );
        String lastName = sc.next();
        Boolean result = Pattern.matches("[A-Z][a-z]{2,}",lastName);
        if (result) {
            System.out.println("Success");
        }
        else {
            System.out.println("please enter valid last name ");
        }
        System.out.println("Last name is: " +lastName);
    }

    public void validEmail(){
        //method to enter valid emailId UC3
        /*Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with
		precise @ and . positions
		 */
        System.out.print("Enter email ID: " );
        String email = sc.next();
        Boolean result = Pattern.matches("^[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)$",email);
        if (result) {
            System.out.println("Success");
        }
        else {
            System.out.println("Please enter valid email Id");
        }
        System.out.println("Your Email Id is: " +email);
    }

    public void contactNumber(){
        //method to enter valid mobile number UC4
        /*Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10 digit number*/
        System.out.print("Enter contact number with country code (91): " );
        String contact = sc.next();

        boolean result = Pattern.matches("[0-9]{2}[\\s]+[0-9]{10}",contact);
        if (result) {
            System.out.println("Success");
        }
        else {
            System.out.println("enter valid contact number");
        }
        System.out.println("Your phone number is: " +contact);
    }

    public void validPassword(){
        /*As a User need to follow pre-defined Password rules. UC 5,6
         Rule1 – minimum 8 Characters
         Rule2 - atleast 1 Upper case
         */
        System.out.println("Enter the Password: ");
        String password = sc.next();
        boolean result = Pattern.matches("[A-Z]+[A-z0-9]{7,}", password);
        if (result) {
            System.out.println("Success");
        } else {
            System.out.println("Enter valid password..");
        }
        System.out.println("Your password is: " +password);
    }


    public static void main(String[] args) {
        System.out.println("Welcome to user registration program");
        UserRegistration userReg = new UserRegistration();
        int option;
        while (true) {
            System.out.print("1.First Name\n2.Last Name\n3.Email\n4.ContactNumber\n5.Password\n6.Exit");
            System.out.println("\nEnter option number: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    userReg.validfirstName();
                    break;
                case 2:
                    userReg.validLastName();
                    break;
                case 3:
                    userReg.validEmail();
                    break;
                case 4:
                    userReg.contactNumber();
                    break;
                case 5:
                    userReg.validPassword();
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid option");
            }
        }
    }
}
