package lesson8.App;

import lesson4.Auth;

import java.util.Scanner;

public class AppCRUD {
    public static void printMenu() {
        System.out.println("AppGRUD");
        System.out.println("<0><Sign_In>");
        System.out.println("<1><Sign_Un>");
        System.out.println("<2><Remove_User>");
        System.out.println("<3><Get_All_Users>");
        System.out.println("<4><Edit_User>");
        System.out.println("<5><Exit>");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserService service = new UserService();
        int command = 0;
        while(true) {
        printMenu();
        command = sc.nextInt();
        switch (command) {
            default:{
                System.out.println("<Unknown command>");
                break;
            }
            case 0:{
                System.out.println("<Enter_Login>");
                String login = sc.next();
                System.out.println("<Enter_Password>");
                String password = sc.next();
                if(service.auth(login,password)) {
                    System.out.println("<Success>");
                } else {
                    System.out.println("<Access_Denied>");
                }
                break;
            }
            case 1:{
                System.out.println("<Enter_new_Login>");
                String login = sc.next();
                System.out.println("<Enter_Password>");
                String password = sc.next();
                System.out.println("<Enter_Fullname>");
                String fullName = sc.next();
                System.out.println("<Enter_Age>");
                int age = sc.nextInt();
                AppUser user = new AppUser(login,password,fullName,age);
                if(service.addUser(user)) {
                    System.out.println("<Success>");
                } else {
                    System.out.println("<Error>");
                }
                break;
            }
            case 5:{
                System.out.println("<Exit>");
                return;
            }
        }
        }
    }
}
