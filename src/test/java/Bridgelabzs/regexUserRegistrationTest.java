package Bridgelabzs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import regexProblems.RegexUserRegistration;
import regexProblemsExceptions.RegexUserRegistrationException;

public class regexUserRegistrationTest {
    @Test
    public void givenString_WhenNull_ShouldReturnFalse(){
        String testString = null;
        try {
            Assertions.assertFalse(RegexUserRegistration.validatePattern(testString, RegexUserRegistration.firstNameRegExpPattern));
        } catch (RegexUserRegistrationException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenString_WhenEmpty_ShouldReturnFalse(){
        String testString = "";
        try {
            Assertions.assertFalse(RegexUserRegistration.validatePattern(testString, RegexUserRegistration.firstNameRegExpPattern));
        } catch (RegexUserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue(){
        String testString = "Shubham";
        try {
            Assertions.assertTrue(RegexUserRegistration.validatePattern(testString, RegexUserRegistration.firstNameRegExpPattern));
        } catch (RegexUserRegistrationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnFalse(){
        String testString = "Sh";
        try {
            Assertions.assertFalse(RegexUserRegistration.validatePattern(testString, RegexUserRegistration.firstNameRegExpPattern));
        } catch (RegexUserRegistrationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue(){
        String testString = "Phoujdar";
        try {
            Assertions.assertTrue(RegexUserRegistration.validatePattern(testString, RegexUserRegistration.lastNameRegExpPattern));
        } catch (RegexUserRegistrationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenLastName_WhenInvalid_ShouldReturnFalse(){
        String testString = "ph";
        try {
            Assertions.assertFalse(RegexUserRegistration.validatePattern(testString, RegexUserRegistration.lastNameRegExpPattern));
        } catch (RegexUserRegistrationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue(){
        String testString = "a.b1.00@abc.net";
        try {
            Assertions.assertTrue(RegexUserRegistration.validatePattern(testString, RegexUserRegistration.emailRegExpPattern));
        } catch (RegexUserRegistrationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenEmail_WhenInvalid_ShouldReturnFalse(){
        String testString = "abc";
        try {
            Assertions.assertFalse(RegexUserRegistration.validatePattern(testString, RegexUserRegistration.emailRegExpPattern));
        } catch (RegexUserRegistrationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue(){
        String testString = "91 9822056132";
        try {
            Assertions.assertTrue(RegexUserRegistration.validatePattern(testString, RegexUserRegistration.mobileNumberRegExpPattern));
        } catch (RegexUserRegistrationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenMobileNumber_WhenInvalid_ShouldReturnFalse(){
        String testString = "+919822056132";
        try {
            Assertions.assertFalse(RegexUserRegistration.validatePattern(testString, RegexUserRegistration.mobileNumberRegExpPattern));
        } catch (RegexUserRegistrationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue(){
        String testString = "asdU2@q4515";
        try {
            Assertions.assertTrue(RegexUserRegistration.validatePattern(testString, RegexUserRegistration.passwordRegExpPattern));
        } catch (RegexUserRegistrationException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void givenPassword_WhenInvalid_ShouldReturnFalse(){
        String testString = "adwssdfrgsadw";
        try {
            Assertions.assertFalse(RegexUserRegistration.validatePattern(testString, RegexUserRegistration.passwordRegExpPattern));
        } catch (RegexUserRegistrationException e) {
            e.printStackTrace();
        }
    }


}