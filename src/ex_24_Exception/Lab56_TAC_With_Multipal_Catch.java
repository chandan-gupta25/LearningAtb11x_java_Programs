package ex_24_Exception;

public class Lab56_TAC_With_Multipal_Catch {
    public static void main(String[] args) {

        try {
            String s1 = null;
            int a1 = 20 / 0;
        } catch (NullPointerException | ArithmeticException e) {

            // NullPointerException e = new NullPointerException();  is automatically created by JVM  (Object is created by JVM )

            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
