package lesson5;

public class Student extends Human {
    private int form;
    public Student(String name, int age, int form) {
        super(name, age);
        this.form = form;
    }
}
