package p04ifstatment;

import java.util.Scanner;

public class IfStatement04 {
    public static void main(String[] args) {

        /*
        Ask user to enter his/her age and gender. If the age is more than 65 and the gender is male
then output will be “Hey man you retired!” else output will be “No need to work”
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age  = input.nextInt();
        System.out.println("Enter your gender");
        String m = "Male";
        String gender = input.next();
        if (age>=66 && gender.equalsIgnoreCase("Male")){
            System.out.println("Hey man you retired!");
        }else {
            System.out.println("No need to work");
        }

    }
}
