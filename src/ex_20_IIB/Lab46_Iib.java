package ex_20_IIB;

public class Lab46_Iib {
    public static void main(String[] args) {
        IIB i1 = new IIB();  //  new IIB();  this is a object we need call this to print IIB.
    }

}

class IIB{

    IIB(){
        System.out.println("DC");
    }

    {
        System.out.println("i am IIB");
    }
    {
        System.out.println("i am IIB2");
    }
}
