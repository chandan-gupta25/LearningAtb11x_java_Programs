package List;

import java.util.ArrayList;
import java.util.List;

public class Lab64_ArraysList {
    public static void main(String[] args) {

        List l = new ArrayList();  //Arraylist arraylist = new Arraylist(); we can also use this
        l.add("chandan");
        l.add(12);
        l.add("gupta");
        l.add("chandan");
       // l.remove(2);
        System.out.println(l);
        System.out.println(l.size());

    }
}
