package ex_26_Collection_FrameWorks.List.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab74_Map {
    public static void main(String[] args) {

        Map m1 = new HashMap();
        m1.put("name", "chandan");   // here name is key and chandan is value
        m1.put("age", "30");
        m1.put("phone", "1235468565");
        System.out.println(m1);


        Map m2 = new LinkedHashMap();
        m2.put("name", "chandan");   // here name is key and chandan is value
        m2.put("age", "30");
        m2.put("phone", "1235468565");
        System.out.println(m2);

        Map m3 = new TreeMap();
        m3.put("name", "chandan");   // here name is key and chandan is value
        m3.put("age", "30");
        m3.put("phone", "1235468565");
        System.out.println(m3);




    }
}
