package ex_14_Single_inheritence;

public class Lab31_inheritenceExample {

    public static void main(String[] args) {

        father f1 = new father();
        f1.bhk2();
        System.out.println("----------------");
        son s1 = new son();
        s1.bhk2();
        s1.bhk3();
        System.out.println(s1.car);
        System.out.println(s1.money);

    }
}


class father{

    String car = "Tesla";
    int money = 10000;

    void bhk2(){
        System.out.println("father has 2bhk flat");
    }




}

class son extends father{
    void bhk3(){
        System.out.println("son has 2BHK flat");
    }
}