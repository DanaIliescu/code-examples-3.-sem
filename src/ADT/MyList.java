package ADT;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Dana on 18-Dec-16.
 */
public class MyList {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Dana");
        arrayList.add("Maria");
        arrayList.add("Iliescu");
        arrayList.add("Dana");
        arrayList.add("M");
        arrayList.add(2,"Mari");

        for (String s: arrayList) {
            System.out.println(s + " ");
        }

        System.out.println();

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dana");
        linkedList.add("Maria");
        linkedList.add("Iliescu");
        linkedList.add("Dana");
        linkedList.add("M");
        linkedList.add(2, "Mari");
        System.out.println(linkedList.indexOf("Dana"));

        for (String s: linkedList) {
            System.out.println(s + " ");
        }
    }
}
