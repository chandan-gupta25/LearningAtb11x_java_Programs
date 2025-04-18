package ex_26_Collection_FrameWorks.List.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab75_itereter {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap();

        map.put("id", 1);
        map.put("id1", 12);
        map.put("id3", 11);
        map.put("id4", null);
        map.put("id5", null);
        map.put("id6", 100);

        for (Map.Entry<String, Integer> item : map.entrySet()){  // need to remember this value
            System.out.println(item.getKey() + "--" + item.getValue());
        }


    }
}
