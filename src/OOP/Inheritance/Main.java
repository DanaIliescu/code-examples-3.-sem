package OOP.Inheritance;

/**
 * Created by Dana on 18-Dec-16.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);

        person.setName("Dana");
        person.setAge(-5);
        System.out.println(person);

//        Person person1 = new Person("Dana", 20, true);
//        System.out.println(person1);

        Student student = new Student();
        student.setName("Dana-Maria");
        student.setGrade(12);
        System.out.println("Student: \n" + student + "\nGrade: " + student.getGrade());


    }
}
