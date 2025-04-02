package ex_13_OopsContructor;

public class Lab29_DCPC {

    public static void main(String[] args) {

        car c1 = new car();

        c1.model = "fortuner";
        c1.year = 2022;
        c1.brand ="toyota";

       car c2 = new car();
        new car();

       c2.brand = "Mahindra";

        System.out.println(c2.brand);
        System.out.println(c1.model);
        System.out.println(c1.year);

    }

}

     class car{

      String brand;
      String model;
      int year;


      // default constructor

         car(){
             brand = "unknown brand";
             model = "xyz";
             year = 1995;
             System.out.println("dc");
         }

     }
