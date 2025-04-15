package ex_26_Collection_FrameWorks.List.Set;

import java.util.LinkedHashSet;

public class Lab70_Linked_Hash_Set {
    public static void main(String[] args) {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("dog");
        linkedHashSet.add("cat");
        linkedHashSet.add("camel");
        linkedHashSet.add("elephant");
        linkedHashSet.add("dog");
        linkedHashSet.add("do");
        linkedHashSet.add("cow");

        System.out.println("linkedhashset :" + linkedHashSet);

        System.out.println("\n comparing order preservation");

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(12);
        set.add(1);
        set.add(2);
        set.add(10);
        set.add(100);

        System.out.println("linkedhash ex_26_Collection_FrameWorks.List.Set :" + set);

    }
}
