package OOP.Abstraction;

/**
 * Created by Dana on 22-Dec-16.
 */
public class Shark extends Animal {
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

    @Override
    public boolean isDead() {
        if(getAge() > 10)
            return true;
        else
            return false;
    }
}

