package Bridgelabzs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class regexUserRegistrationTest {
    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue(){
        String firstName = "Shubham";
        Assertions.assertTrue(RegexUserRegistration.validatePattern(firstName, RegexUserRegistration.firstNameRegExpPattern));
    }
    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnFalse(){
        String firstName = "Sh";
        Assertions.assertFalse(RegexUserRegistration.validatePattern(firstName, RegexUserRegistration.firstNameRegExpPattern));
    }
    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue(){
        String firstName = "Phoujdar";
        Assertions.assertTrue(RegexUserRegistration.validatePattern(firstName, RegexUserRegistration.lastNameRegExpPattern));
    }
    @Test
    public void givenLastName_WhenInvalid_ShouldReturnFalse(){
        String firstName = "ph";
        Assertions.assertFalse(RegexUserRegistration.validatePattern(firstName, RegexUserRegistration.lastNameRegExpPattern));
    }
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue(){
        String firstName = "a.b1.00@abc.net";
        Assertions.assertTrue(RegexUserRegistration.validatePattern(firstName, RegexUserRegistration.emailRegExpPattern));
    }
    @Test
    public void givenEmail_WhenInvalid_ShouldReturnFalse(){
        String firstName = "abc";
        Assertions.assertFalse(RegexUserRegistration.validatePattern(firstName, RegexUserRegistration.emailRegExpPattern));
    }
    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue(){
        String firstName = "91 9822056132";
        Assertions.assertTrue(RegexUserRegistration.validatePattern(firstName, RegexUserRegistration.mobileNumberRegExpPattern));
    }
    @Test
    public void givenMobileNumber_WhenInvalid_ShouldReturnFalse(){
        String firstName = "+919822056132";
        Assertions.assertFalse(RegexUserRegistration.validatePattern(firstName, RegexUserRegistration.mobileNumberRegExpPattern));
    }
    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue(){
        String firstName = "asdU2@q4515";
        Assertions.assertTrue(RegexUserRegistration.validatePattern(firstName, RegexUserRegistration.passwordRegExpPattern));
    }
    @Test
    public void givenPassword_WhenInvalid_ShouldReturnFalse(){
        String firstName = "adwssdfrgsadw";
        Assertions.assertFalse(RegexUserRegistration.validatePattern(firstName, RegexUserRegistration.passwordRegExpPattern));
    }

}