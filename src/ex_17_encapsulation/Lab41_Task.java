package ex_17_encapsulation;

public class Lab41_Task {

    public static void main(String[] args) {

        ATB atb = new ATB("chandan", "Jp chowk", "ATB11X", "pramod",12, 957272025);


        atb.setName("Vijay");
        atb.setAddress("guefghje");
        atb.setCourseName("automation");
        atb.setMobileNo(12345);
        atb.setRollNumber(456);

        System.out.println(atb.getName());
        System.out.println(atb.getAddress());
        System.out.println(atb.getCourseName());
        System.out.println(atb.getMobileNo());
        System.out.println(atb.getRollNumber());
    }
}


class ATB{

    private String name;
    private String address;
    private String courseName;
    private String trainer;
    private int rollNumber;
    private double mobileNo;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public double getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(double mobileNo) {
        this.mobileNo = mobileNo;
    }

    public ATB(String name, String address, String courseName, String trainer, int rollNumber, double mobileNo){

        this.name = name;
        this.address = address;
        this.courseName = courseName;
        this.trainer = trainer;
        this.rollNumber = rollNumber;
        this.mobileNo = mobileNo;

    }
}
