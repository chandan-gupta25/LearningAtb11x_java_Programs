package ex_26_Collection_FrameWorks.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Lab68_Vector {
    public static void main(String[] args) {

        Vector vector = new Vector();

        vector.add("chandan");
        vector.add("gupta");
        vector.add("siwan");
        vector.add("kumar");
        vector.add(30);
        vector.remove("kumar");

        System.out.println(vector.isEmpty());
        System.out.println(vector.size());
        //System.out.println(vector.remove("kumar"));

        for (int i = 0; i <vector.size() ; i++) {
            System.out.println(vector.get(i));
        }
            // for each loop or enhanced loop
            System.out.println("for each loop-------------");
            for (Object o : vector){
                System.out.println(o);
            }

        System.out.println("Iteretor ----------");
        Iterator iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Enumerator-----------");

        Enumeration<Object> enumeration = vector.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

        System.out.println("Listiterator -----------");

        ListIterator listIterator = vector.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("\n backward listiterator");


        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }




    }
}
