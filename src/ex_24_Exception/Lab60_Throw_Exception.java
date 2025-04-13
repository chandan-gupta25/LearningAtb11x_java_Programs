package ex_24_Exception;

import java.util.Scanner;

public class Lab60_Throw_Exception {
    public static void main(String[] args)  {



        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
         int age = sc.nextInt();
        try {
            valiDateAge(age);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //sc.close();

    }

    private static void valiDateAge(int age) throws Exception {
        if (age < 18){
             throw new Exception("you are not allow");
        }


    }

}
