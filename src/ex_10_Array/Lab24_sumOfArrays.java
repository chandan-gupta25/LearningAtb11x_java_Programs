package ex_10_Array;

public class Lab24_sumOfArrays {
    public static void main(String[] args) {

        int[]sum = {1,2,3,4,5,6,7,8,9,0};

        int sum1 = 0;

        for (int i = 0; i < sum.length ; i++) {


             sum1+=sum[i]; //sum1 = sum1 + sum[i]

            System.out.println(sum1);

        }
    }


}
