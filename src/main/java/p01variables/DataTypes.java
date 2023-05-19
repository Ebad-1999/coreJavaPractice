package p01variables;

public class DataTypes {

    /*
    Memory Usage in Java

    we have two types of memory in java

    -stack(small) memory: stores the primitive data types like int, long, short, boolean, char, byte, double, float
    also it is address or reference of non-primitive data.
    -Heap(huge) memory : Stores non-primitive data.

    Note: Object is non-primitive data types because it has methods in it.
    Note: if you use different numeric data types i in any math operation, the result will be in the largest data types.



     */

    public static void main(String[] args) {
        int b=6;
        double a = 55, c = 22.3;

        System.out.println(a+b+c);



        float f = 2.3F, h = 5.3F;
        int z = 5, x = 6, y = 10;
        double d = 66.3, k = 8.6;

        System.out.println(f+h+x+z+y+d+k);



        char ch = 'G';
        int e = 20;

        System.out.println(ch+e);


        String s = "Ahmad";
        int v=5, o=23;
        System.out.println(s+(v+o));
    }







}
