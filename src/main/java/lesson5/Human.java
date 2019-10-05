package lesson5;

public class Human {
    protected String name;
    protected int age;
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void sayHello() {
        System.out.println("Hello, my name " + name);
    }
}
