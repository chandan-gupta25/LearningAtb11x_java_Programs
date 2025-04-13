package ex_15_polymorphism;

public class Lab52_dynamic_dispatch {

    public static void main(String[] args) {
        computer c1 = new laptop();
        c1.type();



    }
}

class computer{
    void type (){
        System.out.println("HP");
    }
}

class laptop extends computer{
    void carrie(){
        System.out.println("easily carry");
    }
}
