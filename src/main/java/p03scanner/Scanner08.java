package p03scanner;

import java.util.Scanner;

public class Scanner08 {
    public static void main(String[] args) {

        /*
        Type a program like;
        Ask user to enter two integer values, the first will be greater than the second.
        The remainder when you divide the first by the second will be the width,
        and the sum of the two numbers will be the length of a rectangle.
        Then calculate the area and the perimeter of the rectangle, and print them
        on the console.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two Integer");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        int width = n1/n2;
        int length = n2+n1;

        System.out.println(width);
        System.out.println(length);
        System.out.println("area "+ (width*length));
        System.out.println("perimeter"+ (2*length*width));

    }
}
