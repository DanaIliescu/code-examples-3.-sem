package OOP.Abstraction;

/**
 * Created by Dana on 22-Dec-16.
 */
public abstract class Animal {
    private int age = 0;

    public void age(){
        this.age++;
        System.out.println("This animal is now " + age + " years old.");
    }

    public int getAge(){
        return this.age;
    }

    public abstract boolean isDead();

    public abstract void eat();

    public abstract void move();
}
