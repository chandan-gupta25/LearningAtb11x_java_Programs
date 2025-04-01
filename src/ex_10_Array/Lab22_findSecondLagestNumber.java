package ex_10_Array;

import java.util.Arrays;

public class Lab22_findSecondLagestNumber {
    public static void main(String[] args) {

        int[] number = {10,20,11,23,25, 30};
        //System.out.println(number.length);
       // System.out.println(number[0]);
        //System.out.println(number[5]);

        //System.out.println("-----------------");

        //for (int i = 0; i < number.length; i++){
          //  System.out.println(number[i]);
        //}
        //System.out.println("---------------");
        //Arrays.sort(number);
       // for (int i = 0; i < number.length; i++) {

            //System.out.println(number[i]);


        int secondLargest = find_second(number);
        System.out.println(secondLargest);


        }

    private static int find_second(int[] number) {

        int max1 = number[0];
        int max2 = number[1];

        if (number[0]>number[1]){
            max1 = number[0];
             max2 = number[1];
        }else{
            max2 = number[0];
            max1= number[1];

        }

        for (int i = 2; i < number.length; i++){
            if (number[i]>max1){
                max2 =max1;
                max1 = number[i];
            } else if ( number[i] > max2) {
                max2 = number[i];
            }
        }

        return max2;


    }


}


