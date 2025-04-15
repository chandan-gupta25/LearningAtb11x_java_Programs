package ex_26_Collection_FrameWorks.List.Set;

import java.util.HashSet;
import java.util.Set;

public class Lab69_Hash_Set {
    public static void main(String[] args) {

        Set<String> car = new HashSet<>();


        car.add("scorpio");
        car.add("Tata");
        car.add("BMW");
        car.add("Toyota");
        car.add("Tata");


        System.out.println(car.isEmpty());
        System.out.println("Size:" + car.size());
        System.out.println("Remove BMW :" + car.remove("BMW"));


        for (String cars : car){
            System.out.println(cars);
        }


    }


}
