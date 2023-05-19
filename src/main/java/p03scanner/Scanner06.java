package p03scanner;

import java.util.Scanner;

public class Scanner06 {

    /*
    Type a program which asks user to enter his/her first name and last name,then print it on the console.

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your firstName and lastName");
        String name = input.next();
        String lastName = input.next();
        System.out.println(name+" "+lastName);


    }
}
