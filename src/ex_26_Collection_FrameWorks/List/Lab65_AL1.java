package ex_26_Collection_FrameWorks.List;

import java.util.ArrayList;
import java.util.List;

public class Lab65_AL1 {
    public static void main(String[] args) {

        List aL1 = new ArrayList();

        aL1.add("chandan");
        aL1.add(1);
        aL1.add("2");
        aL1.add("2");
        aL1.add("3");
        aL1.isEmpty();
        aL1.add(true);


        System.out.println(aL1.size());
        System.out.println(aL1.contains("2"));
        System.out.println(aL1.contains(1));
        System.out.println(aL1.contains("4"));
        System.out.println(aL1.indexOf("3"));
        System.out.println(aL1.lastIndexOf("2"));


    }
}
