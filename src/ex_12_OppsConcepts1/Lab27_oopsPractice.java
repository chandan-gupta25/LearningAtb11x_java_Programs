package ex_12_OppsConcepts1;

public class Lab27_oopsPractice {

    public static void main(String[] args) {

        Person p1 = new Person();   // person=class,  p1=object refrence , new person = object

        p1.name = "chandan";

        p1.age= 30;
        p1.colour = "brown";
        p1.Gender= "male";
        p1.isMarried = true;
        p1.height = 5.7;
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.Gender);
        System.out.println(p1.isMarried);


    }

}

     class Person{
         // Attribute / properties

         String name;
         String Gender;
         String colour;
         int age;
         double mobileNo;
         double height;
         boolean isMarried;
         double weight;

         // method/ behaviour

         void sleep (){
             System.out.println("sleeping");
         }
         String greet(String name){
             return "hello";
         }
         void talk(){}

         int remaining_sal(int salary, int Tax){
             return salary-Tax;

         }

     }
