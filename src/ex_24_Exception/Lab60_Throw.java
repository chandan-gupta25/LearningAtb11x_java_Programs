package ex_24_Exception;

public class Lab60_Throw {
    public static void main(String[] args) {
    }

    static void dividedByZero(int a){
        if (a == 0 ){
            throw new  ArithmeticException();
        }

    }



}
