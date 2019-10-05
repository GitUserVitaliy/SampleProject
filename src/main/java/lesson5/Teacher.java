package lesson5;

public class Teacher extends Human{
    private String subject;
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    public void sayHello() {
        System.out.println("Hello, am a teacher, and my name "+name);
    }
    public void teachStudent(Student student) {
        student.sayHello();
    }
}
