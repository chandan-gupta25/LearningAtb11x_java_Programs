package ex_11_Array;

public class Lab22_maxAndMinimuArrays {
    public static void main(String[] args) {


        int[] marks = {90,99,10,96,58,45,75,82,69,86,53,45};

        int Max_output = give_me_max(marks);
        System.out.println(Max_output);


    }

    private static int give_me_max(int[] marks) {
        int max = marks[0];

        for (int i = 0; i < marks.length ; i++) {
            if (marks[i] > max) {   //to find maximum value
               // if (marks[i] < max) {  // to find minimum value

                 max = marks[i];



            }


        }
        return max;
    }
}
