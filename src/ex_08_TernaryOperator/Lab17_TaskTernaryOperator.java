package ex_08_TernaryOperator;

import java.util.Scanner;

public class Lab17_TaskTernaryOperator {
    public static void main(String[] args) {


        //int grade = 50;

        //Scanner scanner = new Scanner(System.in);
        //int grade = scanner.nextInt();
        String g1 = args[0];
        int grade = Integer.parseInt(g1);

        String result = (grade >= 0 && grade < 60)?"fail":
                         (grade >= 60 && grade < 70)?"D":
                         (grade >= 70 && grade < 80)?"C":
                         (grade >= 80 && grade < 90)?"B":
                         (grade >= 90 && grade <= 100)?"A grade": "Invalid";
        System.out.println(result);
    }
}
