package regexProblems;

import regexProblemsExceptions.RegexUserRegistrationException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUserRegistration {
    public static final String firstNameRegExpPattern = "^[A-Z][a-z]{2,}$";
    public static final String lastNameRegExpPattern = "^[A-Z][a-z]{2,}$";
    public static final String emailRegExpPattern = "^([A-Za-z0-9]+[.+-]?[A-Za-z0-9]+)+[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}[.]?[a-zA-Z]{0,3}";
    public static final String mobileNumberRegExpPattern = "^[0-9]{2}[\\ ][0-9]{10}";
    public static final String passwordRegExpPattern = "^(?=.*[A-Z])(?=.*[0-9]).{8,}$";
    public static final String[] firstNameList= {"Shubham","Sh", "shubham", "Boo888", null, ""};
    public static final String[] lastNameList= {"Phoujdar", "Ph", "phoujdar", "Hoo"};
    public static final String[] emailList= { null, "abc@yahoo.com" ,"abc-100@yahoo.com" ,"abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net",
            "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com", "a.b1.00@abc.net", "abc", "abc@.com.my",
            "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com",
            "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"};
    public static final String[] mobileNumberList= {"9822056132", "+919822056132", "91 9822056132", "+91 9822056132"};
    public static final String[] passwordList= {"adwssdfrgsadw", "asdu2@q4515", "asd2@qU", "asdU2@q", "asdU2@qqq", "asdU2@@qqq", "asdU2@qq#"};

    public static boolean validatePattern(String argument, String regExp) throws RegexUserRegistrationException {
        try {
            Pattern pattern = Pattern.compile(regExp);
            Matcher matcher = pattern.matcher(argument);
            return matcher.matches();
        } catch (NullPointerException e){
            throw new RegexUserRegistrationException("Please enter valid input which is not null.");
        }
    }

    public static void testIfValidOutput(String regExpString, String[] testStrings, String printMessage){
        System.out.printf("\n--------------------------------%s--------------------------------\n",printMessage);
        for (String testString : testStrings) {
            try {
                if (validatePattern(testString, regExpString)) {
                    System.out.printf(" Valid  : %s\n", testString);
                } else
                    System.out.printf("Invalid : %s\n", testString);
            } catch (RegexUserRegistrationException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("-------------------------------------------------------------------------------------");
    }

    public static void main(String[] args) {

        ArrayList<String> firstNameArrayList= new ArrayList<>();
        firstNameArrayList.addAll(Arrays.asList("Shubham","Sh", "shubham", "Boo888", ""));

        firstNameArrayList.forEach(n -> {
            Pattern pattern = Pattern.compile(firstNameRegExpPattern);
            Predicate<String> predicate = pattern.asPredicate();
            if (predicate.test(n)){ System.out.println("Match found "+n); }});
    }


}

