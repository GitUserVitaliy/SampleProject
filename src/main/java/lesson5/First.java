package lesson5;

public class First {
    public static void main(String[] args) {
       Student st = new Student("Petya Pavlov",14,8);
       Teacher tch = new Teacher("Tamara Ivanovna",27,"math");
       st.sayHello();
       tch.sayHello();
    }
}
