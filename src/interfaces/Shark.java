package interfaces;

/**
 * Created by Dana on 19-Dec-16.
 */
public class Shark implements Animal {
    @Override
    public void eat() {
        System.out.println("A shark eats fish.");
    }

    @Override
    public void move() {
        System.out.println("To move, a shark will swim.");
        swim();
    }

    public void swim(){
        System.out.println("Shark swims.");
    }
}
