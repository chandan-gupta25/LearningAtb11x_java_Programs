package ex_13_OopsContructor;

public class Lab30_Parametrisied {
    public static void main(String[] args) {

        mobile m1 = new mobile("iphone", "16Pro Max", 8,128, 2022);

        System.out.println(m1.brand);
        System.out.println(m1.model);
        System.out.println(m1.ram+" " + "GB of Ram");
        System.out.println(m1.memeory + "GB of memory ");
        System.out.println(m1.year);



    }




}


class mobile{

    String brand;
    String model;
    int ram;
    int memeory;
    int year;

    // default

    mobile(){
        System.out.println("-----------");
    }



    // parametrised constructor

    mobile(String brand, String model, int ram, int memeory,int year){

        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.memeory = memeory;
        this.year = year;
    }

}
