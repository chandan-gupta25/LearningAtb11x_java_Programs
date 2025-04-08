package ex_19_super;

public class Lab45_SuperKeyword {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.display();

        Animal a1 = new Animal();
        a1.display();
    }
}

class bird {

    protected String colour= "brown";
     void sound(){
         System.out.println("bird sound");
     }
}


class Animal extends bird{

    protected String colour = "white";
    void sound(){
        System.out.println("animal sound");
    }

    void display(){
        System.out.println(this.colour);
        System.out.println(super.colour);
        super.sound();
    }



}

class dog extends Animal{
    private String colour = "black";
    void display(){
        System.out.println(this.colour);
        System.out.println(super.colour);
    }
}
