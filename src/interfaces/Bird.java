package interfaces;

/**
 * Created by Dana on 19-Dec-16.
 */
public class Bird implements Animal {
    @Override
    public void eat() {
        System.out.println("A bird eats worms.");
    }

    @Override
    public void move() {
        System.out.println("To move, a bird will fly.");
    }
}
