package ex_22_enum;

public class Lab50_EnumPractice {
    public static void main(String[] args) {
        weeks w1 = new weeks();
        System.out.println(w1.days[2]);
        System.out.println(Days.Friday);
        System.out.println(Days.Monday);
    }

}

class weeks {

    String [] days ={"mon", "tue","wed","thur","fri","sat","sun"};
}
enum Days{
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday ,Sunday
}
