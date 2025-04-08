package ex_21_staticsExample;

public class Lab49_Example2 {
    public static void main(String[] args) {

        atb.joinZoom_class();
        atb.toGetAssignment();
        System.out.println(atb.courseName);
        System.out.println(atb.mentor);

        atb a1 = new atb();
        a1.howtoDoAssignment();
        a1.setName("chandan");
        a1.setNumber("152123");
        System.out.println(a1.getName());
        System.out.println(a1.getNumber());

    }
}



class atb{

    {
        System.out.println("when the object will call i wii be call first");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    private String name;
    private String number;
    static String courseName = "ATB11X";
    static  String mentor = "Pramod";

    static void toGetAssignment(){

        System.out.println("do the assignment");
    }

    static void joinZoom_class(){
        System.out.println("join class via zoom is common for every one");
    }

    void howtoDoAssignment(){
        System.out.println("it is different for every one");
    }

}
