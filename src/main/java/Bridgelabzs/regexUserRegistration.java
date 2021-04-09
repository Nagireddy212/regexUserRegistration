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
        String passwordRegExpPattern = "^[a-zA-Z0-9\\.\\+\\*\\$\\^\\(\\)\\-#%&!]{8,}";
        String passwordString = getUserInput(scanner, "Please Enter Valid Password:");
        if(validatePattern(passwordString, passwordRegExpPattern)){
            System.out.println("Password String is Valid.");
        }else
            System.out.println("Password String is invalid.");
    }

}