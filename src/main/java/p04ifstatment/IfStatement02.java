package p04ifstatment;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        /*
        Ex: Type code to print week day and weekend day according to their days.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the day name");

        String dayName = scan.next();

        boolean weekday = dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday") ||
                dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday") || dayName.equalsIgnoreCase("Friday");

        boolean weekendDay =  dayName.equalsIgnoreCase("Sunday") || dayName.equalsIgnoreCase("saturday");

        if (weekday){
            System.out.println("Weekday");

        }else if(weekendDay) {
            System.out.println("Weekend Day");
        }else {
            System.out.println("Invalid Data!  (Not a day)");
        }
    }
}
