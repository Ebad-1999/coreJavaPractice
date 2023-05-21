package p05NestedTernarySwitch;

import java.util.Scanner;

public class NestedTernarySwitch02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the y value");
        int a = scan.nextInt();
        String result = (a%2!=0 && a>29) ? ("Good"):("Bad");
        System.out.println(result);


    }
}
