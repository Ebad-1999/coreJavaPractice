package p07Loops;

import java.util.Scanner;

public class ForLoops02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an Integer");
        String num = scan.next();

        int sum = 0;

        for (int i=0; i<num.length();i++){
            String digit = num.substring(i, i+1);

            if (num.indexOf(digit)  == num.lastIndexOf(digit)){

                sum = sum + Integer.valueOf(digit);
            }
        }













    }
}
