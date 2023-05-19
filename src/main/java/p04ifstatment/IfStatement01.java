package p04ifstatment;

public class IfStatement01 {
    public static void main(String[] args) {

        //Ex: Type code to print negative for the numbers less than zero, non-negative for the numbers greater than or equal to zero

        double d = -2.3;
        if (d>=0){
            System.out.println("Positive");
        }else {
            System.out.println("Negative");
        }


        //Ex: Type code to print "Divisible by 5" if the number can be divided by 5,
        // otherwise print "Not divisible by 5" if the number cannot be divided by 5

        int h = 55;

        if (h%5==0){
            System.out.println("Divisible by 5");
        }else {
            System.out.println("Not divisible by 5");
        }



    }
}
