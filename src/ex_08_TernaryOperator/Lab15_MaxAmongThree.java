package ex_08_TernaryOperator;

public class Lab15_MaxAmongThree {
    public static void main(String[] args) {

        int n1 = 1210;
        int n2 = 160;
        int n3 = 20;

        String result = (n1 > n2) ? (n1 > n3) ? "n1" : "n3" :((n2 > n3)? "n2" : "n3");
        System.out.println(result);

    }
}
