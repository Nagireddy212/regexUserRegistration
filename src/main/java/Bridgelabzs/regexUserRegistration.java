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
        String passwordRegExpPattern = "^(?=.*[A-Z]).{8,}$";
        String[] passwordList= {"adwssdfrgsadw", "asdu2@q4515", "asd2@qU", "asdU2@q", "asdU2@qqq"};


        for (int i = 0; i< passwordList.length; i++) {
            String passwordString = passwordList[i];
            if (validatePattern(passwordString, passwordRegExpPattern)) {
                System.out.printf("Valid : %s\n",passwordList[i]);
            } else
                System.out.printf("Invalid : %s\n",passwordList[i]);
        }

    }


}