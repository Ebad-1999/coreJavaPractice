package p06StringManipulation;

import java.util.Scanner;

public class StringManipulation07 {
    public static void main(String[] args) {

        String str = "String is a non-primitive data types";

        boolean isEmpty = str.isEmpty();
        System.out.println(isEmpty);

        //EX: check if a String has just letters and space in it
        String s = "learn Java earn money";

        boolean result3 = s.replaceAll("[a-zA-z ]", "").isEmpty();
        System.out.println(result3);

        //EX: Check SSn for the following rules
        String ssn = "123456789";

        // 1) must have just digits
        boolean firstRule = ssn.replaceAll("[0-9]", "").isEmpty();

        // 2) must have 9 digits
        boolean secRule = ssn.length()==9;

        if (firstRule && secRule){
            System.out.println("Valid SSN");
        }else {
            System.out.println("Invalid SSN");
        }


        











    }
}
