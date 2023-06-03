package p09Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Arrays06 {

    public static void main(String[] args) {

        //Example: Get String from user and type code to fine the number of words in the String.
        //    "I like to move it, move it"  ==>7

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the text");
//
//        String str = scan.nextLine();
//
//        String numOfWords[]= str.split(" ");
//
//        System.out.println("The number of words is "+ numOfWords.length);
//
//
//
//
//        //EX: count the number of words starts with "a" in the String
//        int cousnt  = 0;
//
//        for (String w : numOfWords){
//            if (w.startsWith("a")){
//                cousnt++;
//            }
//        }

       // System.out.println(cousnt +" word start with a");


        //EX: Type code to fine the longest word in the sentence

        String lWord = "I want to go to university to learn more";
        String word[] = lWord.split(" ");
        System.out.println(Arrays.toString(word));
        Arrays.sort(word, Comparator.comparing(String::length));
        System.out.println(Arrays.toString(word));
        System.out.println(word[word.length-1]);


















    }
}
