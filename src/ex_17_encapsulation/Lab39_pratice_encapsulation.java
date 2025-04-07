package ex_17_encapsulation;

public class Lab39_pratice_encapsulation {
    public static void main(String[] args) {

        car c1 = new car("tesla","XYZ",2019, 200);{

            c1.setSpeed(400);
            System.out.println(c1.getSpeed());

            c1.setNewBrand("scorpio",true );
            System.out.println(c1.getNewBrand());
            c1.setModel("XUV700");
            System.out.println(c1.getModel());
            c1.setYear(2022);
            System.out.println(c1.getYear());
    }


    }





}

class car {


    private String brand;
    private String model;
    private int year;
    private double speed;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNewBrand() {
        return brand;
    }

    public void setNewBrand(String brand, boolean iscompany) {
        if (iscompany){
        this.brand = brand;
    }else {
            System.out.println("not in list");
        }
    }

    public car(String brand, String model, int year, double speed){

        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = speed;

    }



}
