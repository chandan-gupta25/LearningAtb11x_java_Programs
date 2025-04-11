package ex_23_wrapper;

public class Lab54_Wrapper_Class {

    public static void main(String[] args) {

        mobile m1 = new mobile("iphone", "pro max",120000.00);
        mobile m2 = new mobile("Samsung", "ultra",135000.00);
        m2.Display();
        m1.Display();
        m1.setPrice(140000.00);
        m1.Display();
        m2.dial();
        m1.dial();

        System.out.println(mobile.mobile_carrier);
        mobile.switchOnAirplane();

        m1.enterCard();

    }
}

class mobile extends oldMobile{

    private String phone;
    private String model;
    private Double price;
    static String mobile_carrier = "Airtel";

    void Display(){
        System.out.println(this.phone + this.model + this.price);
    }


    mobile (){
        System.out.println("I AM DC");
    }

    public mobile(String phone, String model, Double price) {
        this.phone = phone;
        this.model = model;
        this.price = price;

    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    static void switchOnAirplane(){
        System.out.println("for all ,Airplane mood on ");  // static is common for all

    }
    @Override


    void dial(){
        System.out.println("dail -> touch pad dail");
    }

}

class oldMobile implements SimCard{           //we need to implement sim card

    void dial(){
        System.out.println("only dail");
    }

    @Override
    public void enterCard() {
        System.out.println("insert sim card");
    }
}

interface SimCard{
    void enterCard();                   //abstraction method
}
