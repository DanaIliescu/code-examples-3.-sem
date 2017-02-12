package interfaces;

/**
 * Created by Dana on 18-Dec-16.
 */
public class Main {
    public static void main(String[] args){
        Bird bird = new Bird();
        bird.eat();

        Shark shark = new Shark();
        shark.eat();
        shark.move();
    }
}
