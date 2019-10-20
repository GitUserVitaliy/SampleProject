package homework4;

import com.github.javafaker.Faker;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AppCRUD {
    public static void printMenu() {
        System.out.println("<AppGRUD>");
        System.out.println("<0><Sign_In>");
        System.out.println("<1><Sign_Up>");
        System.out.println("<2><Remove_User>");
        System.out.println("<3><Get_All_Users>");
        System.out.println("<4><Edit_User>");
        System.out.println("<5><Overwrite_Users>");
        System.out.println("<6><Exit>");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserService service = new UserService();
        int command = 0;
        String path = "src\\main\\resources\\users.txt";
        while(true) {
            printMenu();
            command = sc.nextInt();
            switch (command) {
                default:{
                    System.out.println("@Unknown command@");
                    break;
                }
                case 0:{
                    System.out.println("<Enter_Login>");
                    String login = sc.next();
                    System.out.println("<Enter_Password>");
                    String password = sc.next();
                    if(service.auth(login,password)) {
                        System.out.println("@Success@");
                    } else {
                        System.out.println("@Access_Denied@");
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
                        System.out.println("@Success@");
                    } else {
                        System.out.println("@Error@");
                    }
                    break;
                }
                case 2:{
                    System.out.println("<Enter_Login>");
                    String login = sc.next();
                    if(service.deleteUserByLogin(login)) {
                        System.out.println("@Success@");
                    } else {
                        System.out.println("@Access_Denied@");
                    }
                    break;
                }
                case 3:{
                    List<AppUser> list = new LinkedList<>(service.getAllUsers());
                    System.out.println("<Users>");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i).toString());
                    }
                    System.out.println("<End>");
                    break;
                }
                case 4:{
                    System.out.println("<Enter_new_Login>");
                    String login = sc.next();
                    System.out.println("<Enter_Password>");
                    String password = sc.next();
                    System.out.println("<Enter_Fullname>");
                    String fullName = sc.next();
                    System.out.println("<Enter_Age>");
                    int age = sc.nextInt();
                    AppUser user = new AppUser(login,password,fullName,age);
                    if(service.editUser(user)) {
                        System.out.println("@Success@");
                    } else {
                        System.out.println("@Access_Denied@");
                    }
                    break;
                }
                case 5:{
                   service.saveUsers();
                    System.out.println("@Access@");
                    break;
                }
                case 6:{
                    System.out.println("@Exit@");
                    return;
                }
                case 666:{
                    Faker faker = new Faker(new Locale("ru"));
                    System.out.println("<ENTER THE HELL NUMBER!X3>");
                    long hell = sc.nextInt();
                    long begin = System.currentTimeMillis();
                    for (int i = 0; i < hell; i++) {
                        AppUser hellUser = new AppUser(faker.name().firstName(),faker.company().name().replaceAll(" ", ""),faker.name().fullName().replaceAll(" ", ""),faker.number().randomDigit());
                        service.addUser(hellUser);
                        System.out.println(i);
                    }
                    for (int i = 0; i < hell; i++) {
                        AppUser hellUser = new AppUser(faker.superhero().name().replaceAll(" ", ""),faker.company().name().replaceAll(" ", ""),faker.name().fullName().replaceAll(" ", ""),faker.number().randomDigit());
                        service.addUser(hellUser);
                        System.out.println(i + hell);
                    }
                    for (int i = 0; i < hell; i++) {
                        AppUser hellUser = new AppUser(faker.name().username().replaceAll(" ", ""),faker.company().name().replaceAll(" ", ""),faker.name().fullName().replaceAll(" ", ""),faker.number().randomDigit());
                        service.addUser(hellUser);
                        System.out.println();
                    }
                    long end = System.currentTimeMillis();
                    System.out.println("@CURRENT TIME->@" + (end - begin));
                    System.out.println("@CHEAT_ACTIVATED@");
                    break;
                }
            }
        }
    }
}
