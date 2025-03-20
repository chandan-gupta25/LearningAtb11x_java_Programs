package ex_03_SwitchCase;

import java.util.Scanner;

public class Lab03_FibonacciSeries {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("enter the number of terms");
        int n = Scan.nextInt();

        int first = 0, second = 1;
        System.out.println("fibonacci series " + first +","+ second);

        for (int i = 2; i < n; i++){
            int next = first + second;
            System.out.println("," + next);
            first = second;
            second = next;
        }
        Scan.close();
    }
}
