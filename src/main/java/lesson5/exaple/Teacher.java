package lesson5.exaple;

public class Teacher extends Human implements Polite {
    private String subject;
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    public void sayHello() {
        System.out.println("Hello, am a teacher, and my name "+name);
    }
    public void goodBye() {
        System.out.println("Goodbye");
    }
    public void teachStudent(Student student) {
        student.sayHello();
    }
    public String getSubject() {
        return subject;
    }
}
