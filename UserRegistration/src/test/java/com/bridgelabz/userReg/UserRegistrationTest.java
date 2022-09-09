package com.bridgelabz.userReg;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistration userReg = new UserRegistration();

    @Test
    public void firstName_should_returnTrue(){
        String firstName = "Abhishek";
        boolean value = userReg.firstName(firstName);
        Assertions.assertTrue(value);
    }
    @Test
    public void firstName_should_returnFalse() {
        String firstName = "abhishek";
        boolean value = userReg.firstName(firstName);
        Assertions.assertFalse(value);
    }

    @Test
    public void lastName_should_returnTrue(){
        String lastName = "Thakur";
        boolean value = userReg.lastName(lastName);
        Assertions.assertTrue(value);
    }
    @Test
    public void lastName_should_returnFalse(){
        String lastName = "thakur";
        boolean value = userReg.lastName(lastName);
        Assertions.assertFalse(value);
    }

    @Test
    public void email_should_returnTrue(){
        String email = "abhishek18@reddifmail.com";
        boolean value = userReg.email(email);
        Assertions.assertTrue(value);
    }
    @Test
    public void email_should_returnFalse(){
        String email = "abhishek18gmailcom";
        boolean value = userReg.email(email);
        Assertions.assertFalse(value);
    }

    @Test
    public void mobileNum_should_returnTrue(){
        String mobileNum = "91 9504678590";
        boolean value = userReg.mobileNumber(mobileNum);
        Assertions.assertTrue(value);
    }
    @Test
    public void mobileNum_should_returnFalse(){
        String mobileNum = "8859635";
        boolean value = userReg.mobileNumber(mobileNum);
        Assertions.assertFalse(value);
    }


    @Test
    public void password_should_returnTrue(){
        String password = "aAbhu@789";
        boolean value = userReg.password(password);
        Assertions.assertTrue(value);
    }
    @Test
    public void password_should_returnFalse(){
        String password = "qwerty";
        boolean value = userReg.password(password);
        Assertions.assertFalse(value);
    }
}
