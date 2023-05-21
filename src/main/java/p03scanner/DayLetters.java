package p03scanner;

import java.util.Scanner;

public class DayLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of a day in a week: ");
        String dayName = sc.nextLine();

        String letters = "";
        for (int i = 1; i < dayName.length(); i += 2) {
            letters += dayName.charAt(i);
        }

        System.out.println("The second, fourth, and sixth letters of " + dayName + " are: " + letters);
        sc.close();
    }
}