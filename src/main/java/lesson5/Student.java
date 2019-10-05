package lesson5;

public class Student {
    private String name;
    private int age;
    private int form;

    public Student(String name, int age, int form) {
        this.name = name;
        this.age = age;
        this.form = form;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getForm() {
        return form;
    }

    public void sayHello() {
        System.out.println("Hello, my name " + name);
    }
}
