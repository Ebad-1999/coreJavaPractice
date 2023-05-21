package p05NestedTernarySwitch;

import java.util.Scanner;

public class NestedTernarySwitch03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the y value");
        int j = scan.nextInt();
        int i = 1;

        switch (i){
            case 2:
                j+=6;
            case 4:
                j+=1;
            default:
                j+=4;
        }
        System.out.println("j="+j);



    }
}
