package OOP.Inheritance;

/**
 * Created by Dana on 18-Dec-16.
 * OOP, Encapsulation, Abstraction, Polymorphism, Inheritance
 */
public class Person {
    private String name;
    private int age;
    private boolean happy;

    public Person () {

    }

    public Person (String name, int age, boolean happy){
        this.name = name;
        this.age = age;
        this.happy = happy;
    }

    public Person (String name) {
        this.name = name;
    }

    public String toString () {
        return "Name: " + this.name + "\nAge: " + this.age + "\nHappy: " + this.happy;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120)
            this.age = age;
        else
            System.out.println("That is not a valid number for a person's age. Try again.");
    }

    public boolean isHappy() {
        return happy;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }
}
