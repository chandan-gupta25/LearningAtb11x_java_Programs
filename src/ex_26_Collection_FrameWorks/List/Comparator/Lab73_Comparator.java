package ex_26_Collection_FrameWorks.List.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab73_Comparator {

    public static void main(String[] args) {
        student1 s1 = new student1("Ayushmann", 210, 20);
        student1 s2 = new student1("chandan", 200, 28);
        student1 s3 = new student1("puja", 222, 24);

        List<student1> student1List = new ArrayList<>();
        student1List.add(s1);
        student1List.add(s2);
        student1List.add(s3);

       // Collections.sort(student1List,new ageComparator());
        //Collections.sort(student1List,new rollNumberComparator());
        Collections.sort(student1List, new nameComparator());
        System.out.println(student1List);

    }

}
class nameComparator implements Comparator<student1>{

    @Override
    public int compare(student1 s1, student1 s2) {
        return s1.getRollNumber()-s2.getRollNumber();
    }
}
class rollNumberComparator implements Comparator<student1>{

    @Override
    public int compare(student1 o1, student1 o2) {
        return o1.getRollNumber()-o2.getRollNumber();
    }
}

class ageComparator implements Comparator<student1>{

    @Override
    public int compare(student1 o1, student1 o2) {
        return o1.getAge()-o2.getAge();
    }
}


class student1{

    private String name;
    private Integer rollNumber;
    private Integer age;

    public student1(String name, Integer rollNumber, Integer age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "student1{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", age=" + age +
                '}';
    }
}
