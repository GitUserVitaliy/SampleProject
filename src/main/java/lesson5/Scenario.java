package lesson5;

public class Scenario {
    public static void main(String[] args) {
        Student student = new Student("Petya Pavlov", 14, 8);
        Teacher teacher = new Teacher("Tamara Ivanovna", 27, "math");
        Polite[] people = new Polite[2];
        people[0] = student;
        people[1] = teacher;
        for (int i = 0; i < people.length; i++) {
            people[i].goodBye();
        }
        makeSaySomething(student);
    }
    public static void makeSaySomething(Polite polite) {
        polite.goodBye();
    }
}
