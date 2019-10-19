package lesson9.UserP;

import homework4.AppUser;

import java.util.LinkedList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        String path = "users.txt";
        UsersFromFile users = new UsersFromFile();
        users.getListOfUsersFromFile(path);
        List<AppUser> list = new LinkedList<>(users.getUsers());
        for (int i = 0; i < list.size(); i++) {
            list.get(i).toString();
        }
    }
}
