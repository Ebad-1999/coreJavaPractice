package p09Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays03 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Print the number of Student you want to be in this Array");
        int numSt = scan.nextInt();

        String names[] = new String[numSt];
        System.out.println(Arrays.toString(names));

        for (int i = 0; i<numSt ; i++){
            System.out.println("Enter the" +(i+1)+" name. To Stop the insertion please type Q");
            String name = scan.next();
            if(!name.equalsIgnoreCase("q")) {
                names[i] = name;

            }else {
                break;
            }
        }
        System.out.println(Arrays.toString(names));
















    }
}
