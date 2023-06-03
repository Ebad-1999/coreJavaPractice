package p09Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {

    public static void main(String[] args) {

        //Example: [0, 2, 3, 0, 12, 0] put zeros to the end.
        //[2, 3, 12, 0, 0, 0]

        int arr[]={0, 2, 3, 0, 12, 0};

        int brr[]=new int[arr.length];
        int idx = 0;


        for (int i=0; i<arr.length; i++){
            if (arr[i]!=0){
                brr[idx]=arr[i];
                idx++;
            }
        }


        //EX: Type code to check if a specific element exists in an Array or not.
                 //int crr[] = {-12, 23, 5};  check if 23 is exist in array or not

        int crr[] = {-12, 23, 23, 32, 23, 5};

        int con = 0;

        int element = 23;

        for (int w : crr){
            if (w==element){
                con++;
            }
        }
       if (con>0){
           System.out.println("The "+element+" "+ " element is exist");
           System.out.println("The "+element+" "+" element is exist "+" "+con+" "+"times!");
       }else {
           System.out.println("The"+" "+element+" "+"is not exist");
       }


















    }
}
