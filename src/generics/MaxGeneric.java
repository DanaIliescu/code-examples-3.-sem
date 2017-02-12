package generics;

/**
 * Created by Dana on 22-Dec-16.
 */
public class MaxGeneric {
    public static <T extends Comparable<T>> T findMax(T x, T y, T z){
        T max = x;          //assume that x is the largest

        if(y.compareTo(max) > 0)
            max = y;

        if (z.compareTo(max) > 0)
            max = z;

        return max;
    }

    public static void main(String[] args) {
        System.out.println("Max of 9, 1, 5 is " + findMax(9, 1, 5));
        System.out.println("Max of 1.5, 9.0, 5.3, is " + findMax(1.5, 9.0, 5.3));
        System.out.println("Max of \"Bob\", \"bob\", \"Alice\" is " + findMax("Bob", "Alice", "" ));
        MyNewObject myNewObject = new MyNewObject();
        MyNewObject myNewObject1 = new MyNewObject();
        MyNewObject myNewObject2 = new MyNewObject();
        findMax(myNewObject, myNewObject1, myNewObject2);
    }
}
