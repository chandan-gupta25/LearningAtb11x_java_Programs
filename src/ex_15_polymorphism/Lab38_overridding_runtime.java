package ex_15_polymorphism;

public class Lab38_overridding_runtime {

    public static void main(String[] args) {

        dog d1 = new dog();
        d1.sound();


    }
}


class animal{

    void sound(){
        System.out.println("make sound");

    }
}

class dog extends animal{
     @Override
    void sound(){
        System.out.println("bark");
    }
}
