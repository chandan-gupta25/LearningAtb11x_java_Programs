package ex_06_loop_switch;

import java.util.Scanner;

public class Lab12_task_Vowel_consonent {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a string:");
        String str = scanner.nextLine();

        int vowels = 0, consonent = 0;
        str = str.toLowerCase();
         for (int i =0; i < str.length(); i++) {
             char ch = str.charAt(i);
             if (ch >= 'a' && ch <= 'z'){
                 if (ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u'){
                     vowels++;
                 } else {
                     consonent++;
                 }
             }

        }
        System.out.println("vowels is" + vowels);
        System.out.println("consonent is" + consonent);
        scanner.close();
    }
}
