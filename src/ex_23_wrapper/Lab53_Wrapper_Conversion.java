package ex_23_wrapper;

public class Lab53_Wrapper_Conversion {
    public static void main(String[] args) {

        String num = "10";
        int a1 = 20;

        // convert string to wrapper by using ParseX

        Integer a = Integer.parseInt(num);
        System.out.println(a);
        Double d = Double.parseDouble(num);
        System.out.println(a.toString());

         // convert primitive to toString
        int age = 20;
        Integer age_wrapper = age;
        System.out.println(age_wrapper.toString());





    }
}
