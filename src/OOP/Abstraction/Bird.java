package OOP.Abstraction;

/**
 * Created by Dana on 22-Dec-16.
 */
public class Bird extends Animal {
    @Override
    public void eat() {
        System.out.println("A bird eats worms.");
    }

    @Override
    public void move() {
        System.out.println("To move, a bird will fly.");
    }

    @Override
    public boolean isDead() {
        if(getAge() > 2)
            return true;
        else
            return false;
    }
}
