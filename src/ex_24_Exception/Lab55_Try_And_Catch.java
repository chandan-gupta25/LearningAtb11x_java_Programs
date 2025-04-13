package ex_24_Exception;

public class Lab55_Try_And_Catch {

    public static void main(String[] args) {

        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) { //multiple catch is allow
            // exception is big basket we can also use Arthematics exception to catch the unchecked exception
            System.out.println("div by zero is not possible");
        } catch (Exception e) {
            System.out.println("div by zero is not possible 2");
        }

    }
}
