package ex_12_OppsConcepts1;

public class Lab28_exampleofcat {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.age=3;
        d1.bark();
        d1.colour = "Brown";
        d1.bread= "german shephered ";
        System.out.println(d1.age);
        System.out.println(d1.bread);
        System.out.println(d1.colour);
    }
}

class Dog{

    String bread;
    String colour;
    int age;

    void bark(){
        System.out.println("bark");
    }
    void running(){}
}
