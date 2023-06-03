package p09Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays07 {

    public static void main(String[] args) {

        //Example: Type code to check if a specific element exists in an Array or not.
        String str[]={"Ali", "Tom", "Carl", "Angle"};

        //1:Way
        String name = "Carl";
        int counter = 0;

        for (String w : str){

            if (w.equals(name)){
                counter++;
            }
        }

        if (counter>0){
            System.out.println(name + " exists in the array");
        }else {
            System.out.println(name + " dose not exist in the array");
        }

        //2:Way - we will use binarySearch() method
        //  i) If the element exists binarySearch() method returns the index of the element.
        Arrays.sort(str);
        int idx = Arrays.binarySearch(str,"Carl");
        System.out.println(idx);







    }
}
