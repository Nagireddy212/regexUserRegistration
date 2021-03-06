package Bridgelabzs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import regexProblems.RegexUserRegistration;
import regexProblemsExceptions.RegexUserRegistrationException;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class EmailListTest {

    private String argument;
    private boolean expectedValidation;

    public EmailListTest(String argument, boolean expectedValidation) {
        this.argument = argument;
        this.expectedValidation = expectedValidation;
    }

    @Parameterized.Parameters
    public static List<Object[]> data() {
        Object[][] data1 = new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"bc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},
                {"a.b1.00@abc.net", true},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {".abc@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%*.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false},
                {"abc@abc@gmail.com", false},
                {"abc@gmail.com.1a", false},
                {"abc@gmail.com.aa.au", false}
        };
        return Arrays.asList(data1);
    }

    @Test
    public void testEmailList() {
        boolean result = false;
        try {
            result = new RegexUserRegistration().validatePattern(argument, RegexUserRegistration.emailRegExpPattern);
        } catch (RegexUserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(result, expectedValidation);
    }
}
