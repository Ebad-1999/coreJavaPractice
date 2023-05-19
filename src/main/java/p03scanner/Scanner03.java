package p03scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        //Ex: Ask user to enter width, height, and length of a rectangular prism then calculate the total area

        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the height");
//        double height = input.nextDouble();
//        System.out.println("Enter the length");
//        double length = input.nextDouble();
//        System.out.println("Enter the width");
//        double width = input.nextDouble();

        System.out.println("Enter the height, length, width");
        double height = input.nextDouble();
        double length = input.nextDouble();
        double width = input.nextDouble();

        System.out.println("Total surface is "+ (2*width*length)+(2*height*length)+(2*width*height));






    }
}
