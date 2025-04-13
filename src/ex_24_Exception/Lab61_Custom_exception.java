package ex_24_Exception;

public class Lab61_Custom_exception {
    public static void main(String[] args) {

        Bank sbi = new Bank("INR", 100);
        //Bank icici = new Bank("INR", 120);
        Bank jpMorgan = new Bank("USD",140);

        System.out.println(sbi.add(jpMorgan));


    }
}
