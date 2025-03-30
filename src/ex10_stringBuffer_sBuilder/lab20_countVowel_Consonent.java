package ex10_stringBuffer_sBuilder;

import java.util.Scanner;

public class lab20_countVowel_Consonent {
    public static void main(String[] args) {

          String input = "Java is a programming language";
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("enter the statment ot count vowel and consonent");
        //int input = scanner.nextInt();
        int vowel = 0;
        int consonent = 0;
        input = input.toLowerCase();
        System.out.println(input);

        for (int i = 0; i < input.length(); i++ ){
            char ch = input.charAt(i);
            if (ch=='a' ||ch=='e' ||ch=='i' || ch=='o' || ch=='u' ){
                vowel++;
            }else {
                consonent++;
            }
        }
        System.out.println("total vouel is " + vowel);
        System.out.println("total consonent is " + consonent);



    }
}
