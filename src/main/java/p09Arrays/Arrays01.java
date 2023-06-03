package p09Arrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        String names[] = new  String[5];

        System.out.println(Arrays.toString(names));
        names[1] = "Tom";
        names[0] = "Mark";
        names[4] = "Jim";
        names[3] = "Mary";
        names[2] = "Susan";

        System.out.println(Arrays.toString(names));

        System.out.println(names[4]);




        int num []=new int[10];

        num[0] = 46;
        num[1] = 6;
        num[2] = 58;
        num[3] = 77;
        num[4] = 14;
        num[5] = 26;
        num[6] = 45;
        num[7] = 32;
        num[8] = 27;
        num[9] = 22;

        System.out.println(Arrays.toString(num));
        System.out.println(num[0]+num[num.length-1]);












        double prices[] = new double[4];
        prices[0] = 1.2;
        prices[1] = 2.3;
        prices[2] = 5.0;
       prices[3] = 4.51;

        double sum = 0;

        for (int i = 0; i<prices.length; i++){
           sum = sum+prices[i];

        }
        System.out.println(sum);




        double sume = 0;
        for (double w : prices){
            sume = +sume+w;
        }
        System.out.println(sume);
    }
}
