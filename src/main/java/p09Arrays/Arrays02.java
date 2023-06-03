package p09Arrays;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {



    String cities[]=new String[6];
    cities [0] ="Kabul";
    cities [1] ="Islamabad";
    cities [2] ="Washinton";
    cities [3] ="Maskaw";
    cities [4] ="Istalf";
    cities [5] ="Dehle";


    Arrays.sort(cities);
        System.out.println(Arrays.toString(cities));

        for (String w: cities){

            if (w.equals("Istalf")){
                break;
            }
            System.out.println(w);

        }
















    }
}
