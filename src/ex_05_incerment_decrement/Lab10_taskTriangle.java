package ex_05_incerment_decrement;

import java.util.Scanner;

public class Lab10_taskTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //System.out.println("enter the all side of triangle");

        System.out.println("enter the side 1");
        int s1 = scanner.nextInt();
        System.out.println("enter the side 2");
        int s2 = scanner.nextInt();
        System.out.println("enter the side 3");
        int s3 = scanner.nextInt();


        if (s1<=0 || s2<=0 || s3<=0) {
            System.out.println("not a triangle");
            System.exit(0);
        }

            if ((s1+s2)<= s3 || (s1 + s3) <= s2 || (s2+ s3) <= s1){
                System.out.println("Not Triangle");
                System.exit(0);
            }


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
