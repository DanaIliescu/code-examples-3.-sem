package ADT;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Dana on 18-Dec-16.
 */
public class MySet {
    public static void main(String[] args) {
        Set hashSet = new HashSet();
        hashSet.add("Dana");
        hashSet.add("Maria");
        hashSet.add("Ana");
        hashSet.add("Andrew");
        System.out.println(hashSet.contains("Dana"));
        System.out.println(hashSet.isEmpty());
        System.out.println(hashSet.toString());

        Set treeSet = new TreeSet();
        treeSet.add("Dana");
        treeSet.add("Dana");
        treeSet.add("Maria");
        treeSet.add("Ana");
        System.out.println(treeSet.toString());

        Set linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("Dana");
        linkedHashSet.add("Maria");
        linkedHashSet.add("Maria");
        linkedHashSet.add("Dana");
        linkedHashSet.add("Ana");

        System.out.println(linkedHashSet.size());
        System.out.println(linkedHashSet.toString());
    }
}
