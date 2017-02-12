package generics;

/**
 * Created by Dana on 22-Dec-16.
 */
public class PrintGeneric {
    public static <T> void printArray (T[] arr){
        for (T element: arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 3, 7, 4, 2};
        Double[] doubleArray = {1.1, 2.5, 3.7};
        String[] stringArray = {"Alice", "Bob"};

        System.out.println(intArray);
        System.out.println(doubleArray);
        System.out.println(stringArray);

        printArray(intArray);
        printArray(doubleArray);
        printArray(stringArray);
    }
}
