package p04ifstatment;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {

        /*
        Type java code, if an integer is even, output will be “The integer is even”.
        If the integer is odd, output will be “The integer is odd”.
         */

        int i = 12;
        if (i%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }

       // Ask user to enter the values of length and width of a rectangle, then check if it is square or not.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length and width of the square");
        int l = scan.nextInt();
        int w = scan.nextInt();

        if (l==w){
            System.out.println("Square");
        }else {
            System.out.println("Not a square");
        }


        /*Ask user to enter his/her age. If the age is between 18 and 65 then output will be “You should work”,
          else output will be “No need to work”

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age  = input.nextInt();
        if (age>=18 && age<=65){
            System.out.println("You should work");
        }else {
            System.out.println("No need to work");
        }



    }
}
