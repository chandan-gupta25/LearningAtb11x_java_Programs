package ex_11_Array;

public class practice {

    public static void main(String[] args) {
        int [] num = {56,48,96,55,1,236,45,78,98,115,55,};

        int second_largest = secondLargest(num);
        System.out.println(second_largest);
    }

    private static int secondLargest(int[] num) {

        int max1 = num[0];
        int max2 = num[1];

        if (num[0]>num[1]){
            max1 = num[0];
            max2 = num[1];

        }else {

            max1 = num[1];
            max2 = num[0];

        }
        for (int i =2; i < num.length; i++){
            if (num[i]>max1){
                max2 = max1;
                max1 = num[i];
            } else if (num[i]> max2) {

                max2= num[i];
            }
        }
        return max2;

    }
}
