package ex_21_staticsExample;

public class Lab47_statics_IIB {
    public static void main(String[] args) {
        S s1 = new S();
        S s2 = new S();

        //new S();
    }
}


class S {

    {
        System.out.println("IIB"); // IIB called many times
    }

    S(){
        System.out.println("DC");
    }

    static {
        System.out.println("SIB");  // SIB called only once
    }
}
