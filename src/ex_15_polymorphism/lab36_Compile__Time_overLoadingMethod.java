package ex_15_polymorphism;

public class lab36_Compile__Time_overLoadingMethod {

    public static void main(String[] args) {

        addition add = new addition();
        System.out.println(add.add(2, 8));
        System.out.println(add.add(2.8, 9.56));
        System.out.println(add.add(96,58,45));
    }
}


class addition{

    int add (int a, int b){
        return a + b;
    }

    double add (double a, double b){
        return a + b;
    }

    int add (int a, int b,int c){
        return a+b+c;
    }
}