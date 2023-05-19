package p03scanner;

import java.util.Scanner;

public class Scanner10 {
    public static void main(String[] args) {


        /*
        Ask user to enter two integer values. Write a Java Program to swap
two numbers by using the third variable.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two Integers");
        int a= scan.nextInt();
        int b = scan.nextInt();

        System.out.println("a "+ a);
        System.out.println("b "+ b);
        int c = 0;

        a=b;
        b=a;
        System.out.println("sa "+ a);
        System.out.println("sb "+ b);

    }
}
