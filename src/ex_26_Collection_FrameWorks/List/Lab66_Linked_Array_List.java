package ex_26_Collection_FrameWorks.List;

import java.util.LinkedList;

public class Lab66_Linked_Array_List {
    public static void main(String[] args) {

        LinkedList lL = new LinkedList();

        lL.add("dog");
        lL.add("cat");
        lL.addFirst("lion");
        lL.addLast("elephant");

        System.out.println("list of linkedList" + lL);

        //acessing element
        System.out.println("first animal" + lL.getFirst());
        System.out.println("last animal" + lL.getLast());

        // removing elements

        System.out.println("remove second animal\n" + lL.remove(2));
        System.out.println("removing elephant" + lL.removeLast());

        System.out.println("size of LinkedList" + lL.size());

    }

}
