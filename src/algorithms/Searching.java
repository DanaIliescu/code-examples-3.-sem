package algorithms;

/**
 * Created by Dana on 22-Dec-16.
 */
public class Searching {
    public static void main(String[] args) {
        int[] array = {2, 10, 9, 30, 23, 29, 100, 80};
        int[] sortedArray = {1, 11, 25, 27, 30, 38, 100};

        System.out.println("Element 30: " + linearSearch(array, 30));
        System.out.println("Element 30: " + binarySearchDiv(array, 30));
        System.out.println("Element 30: " + binarySearchRec(array, 30));
        System.out.println("Element 30: " + binarySearchDiv(sortedArray, 30));
        System.out.println("Element 30: " + binarySearchRec(sortedArray, 30));
        System.out.println("Element 90: " + linearSearch(array, 90));
        System.out.println("Element 90: " + binarySearchRec(sortedArray, 90));
        System.out.println("Element 90: " + binarySearchDiv(sortedArray, 90));
    }

    public static int linearSearch(int[] array, int x){
        for (int i = 0; i < array.length; i++) {
            if (x == array[i])
                return i;
        }
        return -1;
    }

    public static int binarySearchDiv(int[] array, int x) {
        int start = 0;
        int end = array.length - 1;
        while(start <= end){
            int middle = (start + end)/2;
            if (x == array[middle])
                return middle;
            if (x < array[middle])
                end = middle - 1;
            else
                start = middle + 1;
        }
        return -1;
    }

    public static int binarySearchRec(int[] array, int x) {
        return search(array, x, 0, array.length);
    }

    public static int search(int[] array, int x, int start, int end){
        if (start < end) {
            int middle = start + (end - start)/2;
            if (x < array[middle])
                return search(array, x, start, middle);
            else
            if (x > array[middle])
                return  search(array, x, middle + 1, end);
            else
                return middle;
        }
        return -1;
    }
}
