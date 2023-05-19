package p03scanner;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        //Ex: get first, middle, the last names, and ssn from the user then print them like the given format
        // Tom Jim Hanks
        //2365478932

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name ");
        String name = scan.next();
        System.out.println("Enter your middle name");
        String middle = scan.next();
        System.out.println("Enter your lastName");
        String last = scan.next();
        System.out.println("Enter your SSN #");
        int ssn = scan.nextInt();

        System.out.println(name +" "+ middle+" "+last);
        System.out.println(ssn);


    }
}
