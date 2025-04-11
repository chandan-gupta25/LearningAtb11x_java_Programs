package ex_23_wrapper;

public class Lab52_Wrapper_example {

    public static void main(String[] args) {

        int a = 10;
        Integer b = a;  //we convert int into a wrapper class which has attribute and behaviour. This process is called Boxing
        System.out.println(b.hashCode());// here b has behaviour .hashcode

        Integer a1 = 20;
        int b1 = a1;
        System.out.println(b1);  // here b1 is lost its behaviour and this process is called as Unboxing

    }

}
