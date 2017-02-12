package OOP.Inheritance;

/**
 * Created by Dana on 18-Dec-16.
 */
public class Student extends Person {
    private int grade;

    public int getGrade(){
        return grade;
    }

    public void setGrade(int grade){    //valid: -3, 0, 2, 4, 7, 10, 12
        this.grade = grade;
    }
}
