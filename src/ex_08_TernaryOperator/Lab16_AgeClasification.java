package ex_08_TernaryOperator;

public class Lab16_AgeClasification {

    public static void main(String[] args) {

        int age = 64;
        String result = (age < 18) ?  "minor" : ((age < 65)? "adult" :"Senior");
        System.out.println(result);
    }
}
