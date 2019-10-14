package homework4;

public class AppUser {
    private String login;
    private String password;
    private String fullName;
    private int age;

    public AppUser(String login, String password, String fullName, int age) {
        this.login = login;
        this.password = password;
        this.fullName = fullName;
        this.age = age;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    public String getFullName() {
        return fullName;
    }
    public int getAge() {
        return age;
    }
    public String toString() {
        return login +"{" +
                "password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}
