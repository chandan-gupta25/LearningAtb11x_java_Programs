package ex_24_Exception;

public class Lab57_exceptions {
    public static void main(String[] args) {

        System.out.println("Start of program");

        try {
            String s2 = args[0];

            int a = Integer.parseInt(s2);
            int output = 100 / 0;
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End of program");



    }
}
