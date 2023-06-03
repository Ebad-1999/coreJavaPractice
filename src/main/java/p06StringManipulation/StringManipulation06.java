package p06StringManipulation;

import java.util.Scanner;

public class StringManipulation06 {
    public static void main(String[] args) {

        String str = "Ali is 13 years old, I like Ali, Ali dose not like me!...";

        //EX: How many punctuation marks are used in the given String
        //First Way
        int length = str.replaceAll("\\w", "").replaceAll("\\s", "").length();
        System.out.println(length);

        //Second Way
        int numOfAllChars = str.length();

        int numOfAllCharsDifferentFromPunctuationMarks = str.replaceAll("\\p{Punct}", "").length();

        System.out.println(numOfAllChars-numOfAllCharsDifferentFromPunctuationMarks);


        //EX: Ask user to enter his full name, and fix if the user enters space at the beginning and at the end.
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name");
        String name = scan.nextLine();
        System.out.println(name);

        String fixedFullName = name.trim();
        System.out.println(fixedFullName);












    }
}
