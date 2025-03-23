package ex_05_incerment_decrement;

import java.util.Scanner;

public class Lab10_taskTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the all side of triangle");

        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int s3 = scanner.nextInt();

        if (s1 == s2 && s2 == s3){
            System.out.println("Equilateral");


        }
        else if (s1 == s2 || s2 == s3 || s3 == s1 ) {
            System.out.println("isosceles");

        }
        else{
            System.out.println("scalene");
        }
             scanner.close();
    }

}
