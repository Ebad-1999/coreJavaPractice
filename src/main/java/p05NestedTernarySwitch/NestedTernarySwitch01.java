package p05NestedTernarySwitch;

import java.util.Scanner;

public class NestedTernarySwitch01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the y value");
        int y = scan.nextInt();
        boolean result = (y%2==0 || y<13) ? (true):(y<0?true:false);
        System.out.println(result);


    }
}
