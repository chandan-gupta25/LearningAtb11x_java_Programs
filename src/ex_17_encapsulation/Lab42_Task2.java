package ex_17_encapsulation;

public class Lab42_Task2 {

    public static void main(String[] args) {
        atbStudent[] student =new atbStudent[3];

        student[0] =new atbStudent("chandan", 20,"automation");
        student[1] =new atbStudent("Ayushmann", 1,"Manual testing");
        student[2] =new atbStudent("puja", 21,"Arts");

        for (atbStudent students : student){
            System.out.println(students);
        }

        System.out.println("\n new updated elements");
        student[0].setAge(25);
        student[0].setName("gupta");
        for (atbStudent students : student){

            System.out.println(students);
        }
    }

}


class atbStudent{
    private String name;
    private int age;
    private String course;

    public atbStudent(String name, int age, String course){

        this.name = name;
        this.age = age;
        this.course = course;



    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    @Override

    public String toString(){
        return "name:" + this.name + "\nage:" + this.age + "\ncourse:" + this.course;
    }


}
