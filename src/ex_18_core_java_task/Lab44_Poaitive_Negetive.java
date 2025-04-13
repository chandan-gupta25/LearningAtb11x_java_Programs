package ex_18_core_java_task;

import java.util.Scanner;

public class Lab44_Poaitive_Negetive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number i will check negative or positive");
        int number = scanner.nextInt();

        if (number > 0){
            System.out.println("positive number");
        }else {
            System.out.println("negative number");
        }
          scanner.close();
    }

}
