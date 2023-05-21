package p01variables;

import java.time.LocalDate;
import java.util.Scanner;

public class p06Variables {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter date of birth to calculate the age");
        int dobb = scan.nextInt();

        int age = calculateAge(dobb);
        System.out.println(age);
    }

    public static int calculateAge(int dob){
        return LocalDate.now().getYear()-dob;
    }




}
