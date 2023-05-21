package p04ifstatment;

import java.util.Scanner;

public class NestedIfStatement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character or a latter");
        char c = scan.next().charAt(0);
        if ((c>='A' && c<='Z') || (c>='a' && c<='z') ){
            System.out.println("character");
        }else {
            System.out.println("Not a character");
        }


    }
}
