package algorithms;

import java.util.Arrays;

/**
 * Created by Dana on 22-Dec-16.
 */
public class Sorting {
    public static void main(String[] args) {
        int[] arr = {1,6,7,8,9,3,2,1,10,200};
        print(arr);
        mergeSort(arr);
        print(arr);
    }

    public static void bubbleSort(int[] array){
        for (int i = array.length - 1; i >= 0; i--){
            for (int j = 1; j <= i; j++){
                if(array[j-1] > array[j]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            int min = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[min])
                    min = j;
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    public static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++){
            int index = array[i];
            int j = i;
            while (j > 0 && array[j-1] > index){
                array[j] = array[j-1];
                j--;
            }
            array[j] = index;
        }
    }

    public static void mergeSort(int[] a) {
        if (a.length >= 2) {
            // split array in half
            int[] left  = Arrays.copyOfRange(a, 0, a.length / 2);
            int[] right = Arrays.copyOfRange(a, a.length / 2, a.length);

            // sort the halves
            mergeSort(left);
            mergeSort(right);

            // merge them back together
            merge(left, right, a);
        }
    }

    // Combines the contents of sorted left/right arrays into output array a.
    // Assumes that left.length + right.length == a.length.
    public static void merge(int[] left, int[] right, int[] a) {
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1] < right[i2])) {
                a[i] = left[i1];
                i1++;
            } else {
                a[i] = right[i2];
                i2++;
            }
        }
    }

    public static void print(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++){
            System.out.print(array[i] + ",");
        }
        System.out.print(array[array.length - 1] + "]");
        System.out.println();
    }
}
