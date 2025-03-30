package ex10_stringBuffer_sBuilder;

import java.util.Scanner;

public class Lab21_Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter the input i will check Pelindrome");
        String userinput = scanner.next();
        String newstring = reverseString(userinput);

        if (newstring.equalsIgnoreCase(userinput)){
            System.out.println("palindrome");
        }else {
            System.out.println("not pelindrome");
        }
    }

    private static String reverseString(String userinput) {
        String reversed = "";
        for (int i = userinput.length() - 1; i>= 0; i-- ){
            reversed = reversed+ userinput.charAt(i);
        }
        return reversed;
    }
}
