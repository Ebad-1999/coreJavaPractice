package p03scanner;

import java.util.Scanner;

public class Scanner01 {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");

        int age = scan.nextInt();

        System.out.println(age);

        System.out.println("Enter your name");
        String name  = scan.nextLine();
        System.out.println(name);

        System.out.println("Enter your address");
        String address = scan.next();
        System.out.println(address);








    }
}
