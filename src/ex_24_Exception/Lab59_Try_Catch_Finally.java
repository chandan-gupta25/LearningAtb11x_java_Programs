package ex_24_Exception;

import java.util.Scanner;

public class Lab59_Try_Catch_Finally {
    public static void main(String[] args) {

        Scanner sc = null;
        sc = new Scanner(System.in);
        int a = sc.nextInt();
        try {
            int b =20 / a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
            System.out.println("sc will closed00");
        }


    }
}
