package ex_17_encapsulation;

public class Lab43_toStringExample {

    public static void main(String[] args) {
        example e1 = new example("chandn", "siwan",30);

        System.out.println(e1.toString());
    }
}


class example{

    private String name;
    private String add;
    private int age;

    public example(String name, String add, int age){

        this.name = name;
        this.add = add;
        this.age = age;
    }
    @Override
    public String toString(){
        return "name:" + this.name + "\nadd:" + this.add + "\nage:" + this.age;

    }
}