package lesson4;

import java.util.Scanner;

public class Auth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter login: ");
        String login = sc.next();
        System.out.println("Enter password: ");
        String password = sc.next();
        if (logIn(login, password)) {
            System.out.println("ACCESS");
        } else {
            System.out.println("ACCESS DENIED");
        }
    }
    public static boolean logIn(String login,String password) {
        String correctLogin = "pupil";
        String correctPassword = "pupil";
        if(login.equals(correctLogin) && password.equals(correctPassword)) {
            return true;
        } else {
            return false;
        }
    }
}
