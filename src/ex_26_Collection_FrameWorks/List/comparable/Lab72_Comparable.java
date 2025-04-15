package ex_26_Collection_FrameWorks.List.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab72_Comparable {
    public static void main(String[] args) {
        student s1 = new student(100, "Chandan", 28);
        student s2 = new student(105, "vijay", 30);
        student s3 = new student(110, "avi", 26);

        List<student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

//        Collections.sort(studentList);   which is not possible in case of different data type so we use overridden now it will work

        Collections.sort(studentList);
        System.out.println(studentList);
    }
}

class student implements Comparable<student> {

    private int rollNumber;
    private String name;
    private int age;

    public student(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

//    @Override
//    public int compareTo(Object o) {
//        return this.rollNumber- o
//    }
//
//    @Override
//    public int compareTo(student o) {
//        return this.rollNumber-o.rollNumber;
//    }
//    @Override
//    public int compareTo(student o) {
//        return this.age-o.age;
//    }
    @Override
    public int compareTo(student o) {
        return this.name.compareTo(o.name);
    }
}
