package p03scanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //Ex: get the width and the length of a rectangle from the user and calculate the area of the rectangle

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the width");
        int width = scan.nextInt();
        System.out.println("Enter the length");
        int length = scan.nextInt();
        System.out.println("Area is "+length*width);



    }
}
