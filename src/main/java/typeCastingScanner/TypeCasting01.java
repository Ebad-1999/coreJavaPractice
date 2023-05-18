package typeCastingScanner;

public class TypeCasting01 {

    public static void main(String[] args) {


        /*
        Order of operation in math
        1) Calculate the exponential
        2) Do the operation inside the parenthesis
        3) Do additions and subtractions
        4) Do the additions and subtractions

         */

        int re = 3-2*(5+2*3)/11;
        System.out.println(re);


        /*
        Type Casting
        1) AutoWidening: Converting small data types in to the large data types.
        2) ExplicitNarrowing: Converting large data types in the small data types.

         */


        //AutoWidening
        int m = 14;
        double d = m;
        System.out.println(m);
        System.out.println(d);


        //ExplicitNarrowing
        int n = 15;
        byte b = (byte)n;
        System.out.println(n+b);





















    }
}
