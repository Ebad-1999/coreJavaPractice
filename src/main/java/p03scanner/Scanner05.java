package p03scanner;

import java.util.Scanner;

public class Scanner05 {

    /*
    Type a program which converts the mile to kilometer. Mile value will be
entered by user. (Use double)
Hint 1: km = mile x 1.6
Hint 2: To get double, use nextDouble()
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the mile");
        double mile = scan.nextDouble();
        int kilometer = 1000;
        System.out.println(mile*kilometer+" kilometer");


    }


}
