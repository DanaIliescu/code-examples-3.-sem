package generics;

import java.util.Arrays;

/**
 * Created by Dana on 18-12-2016.
 */

public class MyList<T> {
    private T[] data;
    private int size;

    public MyList() {
        init();
    }

    private void init(){
        data = (T[]) new Object[2];
        size = 0;
    }

    public void add(T element) {
        ensureCapacity();
        data[size++] = element;
    }

    public void add(int index, T el) {
        ensureCapacity();
        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }
        data[index] = el;
        size++;
    }

    public T remove(int index) {
        if (index < size && index >= 0) {
            T temp = data[index];
            for (int i = index; i < size; i++) {
                data[i] = data[i + 1];
            }
            size--;
            return temp;
        } else {
            throw new RuntimeException("You are a big fail.");
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear(){
        init();
    }

    private void ensureCapacity() {
        if (size >= data.length) {
            data = Arrays.copyOf(data, size + 10);
        }
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += data[i] + " ";
        }
        return result;
    }
}