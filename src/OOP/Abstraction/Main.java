package OOP.Abstraction;

/**
 * Created by Dana on 22-Dec-16.
 */
public class Main {
    public static void main(String[] args) {
        Animal animalBird = new Bird();
        Bird bird = new Bird();

        Shark shark = new Shark();

        animalBird.eat();
        bird.eat();

        shark.eat();
        shark.age();
        shark.age();
        System.out.println(shark.isDead());
    }
}
