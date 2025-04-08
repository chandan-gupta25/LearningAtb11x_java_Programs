package ex_21_staticsExample;

public class Lab48_Static_ex {

    public static void main(String[] args) {

        A s1 = new A(12);
        s1.display();
        System.out.println(A.b);

        System.out.println("----------------");

        A.b = 55;

        A s2 = new A(25);
        s2.display();
        System.out.println(A.b);

        A s3 = new A(50);
        s3.display();
        System.out.println(A.b);
    }
}

class A {

    int a;
    static int b = 20;

    A(int a){
        this.a = a;
    }

    void display(){
        System.out.println(this.a);
    }


}
