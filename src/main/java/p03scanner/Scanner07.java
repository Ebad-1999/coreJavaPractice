package p03scanner;

import java.util.Scanner;

public class Scanner07 {

    /*
    Type a program which asks user to enter his/her full name, and address
    then print them on the console like the full name should be in the first line,
    and the address will be in the second line.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name and address");
        String fullName = scan.next();
        String address = scan.next();
        System.out.println(fullName);
        System.out.println(address);



    }
}
