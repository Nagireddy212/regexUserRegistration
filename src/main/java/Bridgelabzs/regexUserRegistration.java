package Bridgelabzs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexUserRegistration {
    static Scanner scanner = new Scanner(System.in);



    public static String getUserInput(Scanner sc, String message){
        System.out.printf("%s\n",message);
        return sc.next();
    }

    public static boolean validatePattern(String argument, String regExp){
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(argument);
        return matcher.matches();
    }

    public static void main(String[] args) {

        String mobileNumberRegExpPattern = "^[0-9]{2}[\\ ][0-9]{10}";
        String mobileNumberString = getUserInput(scanner, "Please Enter Valid Mobile Number:");
        if(validatePattern(mobileNumberString, mobileNumberRegExpPattern)){
            System.out.println("Mobile Number String is Valid.");
        }else
            System.out.println("Mobile Number String is invalid.");
    }

}