package lesson9.UserP;

import homework4.AppUser;

import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class UsersFromFile {
    private List<AppUser> users;
    public UsersFromFile() {
        String login = "admin";
        String password = "admin";
        String fullName = "admin";
        int age = 0;
        AppUser user = new AppUser(login, password, fullName, age);
        users.add(user);
    }
    public static void getListOfUsersFromFile(String path) {
        try (FileReader reader = new FileReader(path)) {
            Scanner sc = new Scanner(reader);
            String login = sc.next();
            String password = sc.next();
            String fullName = sc.next();
            int age = sc.nextInt();
            AppUser user = new AppUser(login,password,fullName,age);
            users.add(user);
        } catch (IOException exception) {
            System.out.println("<Error>" + exception.getMessage());
        }
    }
    public List<AppUser> getUsers() {
        return users;
    }
}
