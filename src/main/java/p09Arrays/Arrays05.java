package p09Arrays;

import java.util.Arrays;

public class Arrays05 {

    public static void main(String[] args) {

        //Example: 09/20/20222 is gicven, print the data like "Month:09 Day:20 Year: 2022"
        String date = "09/20/2022";
;

        String dataArray[]= date.split("/");

        System.out.println(Arrays.toString(dataArray));

        System.out.println("Month:"+dataArray[0] +" "+ "Day:"+dataArray[1]+" "+"Year:"+dataArray[2]);

















    }
}
