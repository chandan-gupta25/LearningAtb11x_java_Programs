package ex_11_Array;

public class Lab26_PyramidPatter {
    public static void main(String[] args) {

        int n =9;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*" + " ");

            }
            System.out.println();

        }


    }
}
