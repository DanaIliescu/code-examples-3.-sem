package collections;

import java.util.*;

/**
 * Created by Dana on 22-Dec-16.
 */
public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        stack.push("Alice");
        stack.push("Bob");

        System.out.println(stack.toString());
        System.out.println(stack.peek());
        // stack.pop();
        System.out.println(stack.toString());
        System.out.println(stack.empty());
        System.out.println(stack.search("Alice"));

        Queue queue = new LinkedList();
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Cody");

        System.out.println(queue.toString());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.toString());
        System.out.println(queue.remove());
        System.out.println(queue.toString());

        Map hashMap = new HashMap();
        hashMap.put("Alice", 1500.00);
        hashMap.put("Bob", 2000.00);
        hashMap.put("Mike", 500.00);

        Iterator it = hashMap.entrySet().iterator();
        Iterator itKey = hashMap.keySet().iterator();
        Iterator itValue = hashMap.values().iterator();

        while (itKey.hasNext() && itValue.hasNext()){
            System.out.println(itKey.next() + " has " + itValue.next());
        }
        System.out.println();

        System.out.println(hashMap.replace("Alice", 1500.00, 2500.00));
        System.out.println(hashMap.get("Alice"));

    }

    public static void printMap(Map mp) {
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }
    }
}
