package generics;

/**
 * Created by Dana on 18-Dec-16.
 */
public class Main {
    public static void main(String[] args) {
        MyList<Integer> integerMyList = new MyList<>();
        integerMyList.add(2);
        integerMyList.add(5);
        integerMyList.add(1);
        integerMyList.remove(5);
        System.out.println(integerMyList.isEmpty());
        System.out.println(integerMyList.toString());

        MyList<String> stringMyList = new MyList<>();
        stringMyList.add("Dana");
        stringMyList.add("Maria");
        System.out.println(stringMyList.toString());
        stringMyList.clear();
        System.out.println(stringMyList.toString());
    }
}
