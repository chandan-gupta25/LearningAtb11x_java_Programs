package ex_24_Exception;

public class Lab58_IQ1 {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        try {
            int c = 10 / a;    // this line is vulnerable code so only this code goes under try and catch
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }


    }
}
