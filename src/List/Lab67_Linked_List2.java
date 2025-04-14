package List;

import java.util.LinkedList;
import java.util.List;

public class Lab67_Linked_List2 {

    public static void main(String[] args) {

        List lL1 = new LinkedList();

        lL1.add("chandan");
        lL1.add("kumar");
        lL1.add("gupta");
        lL1.add("30");
        lL1.add("chandan");
        lL1.isEmpty();
        lL1.add(32);


        System.out.println(lL1.size());
        System.out.println(lL1.contains("chandan"));
        System.out.println(lL1.indexOf("chandan"));
        System.out.println(lL1.lastIndexOf("chandan"));

        for (int i = 0; i <lL1.size() ; i++) {
            System.out.println(lL1.get(i));

        }

    }
}
