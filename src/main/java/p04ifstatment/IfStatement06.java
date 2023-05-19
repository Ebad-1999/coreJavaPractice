package p04ifstatment;

import java.util.Scanner;

public class IfStatement06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");

        int age = scan.nextInt();

        if (age<=0){
            System.out.println("Invalid age");
        }else if ( age<=4){
            System.out.println("baby");
        } else if ( age<=12) {
            System.out.println("Child");
        }else if (age<=20) {
            System.out.println("teenager");
        }else if (age<=30) {
            System.out.println("adult");
        }else {
            System.out.println("Not expected age");
        }
    }
}
