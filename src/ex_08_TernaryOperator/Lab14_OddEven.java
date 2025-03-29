package ex_08_TernaryOperator;

import java.util.Scanner;

public class Lab14_OddEven {

    public static void main(String[] args) {

        int n1 = 15;

       // Scanner sacnner = new Scanner(System.in);
        //int n1 = sacnner.nextInt();

        String result = (n1%2==0) ? "even" :"odd";

        System.out.println(result);
    }
}
