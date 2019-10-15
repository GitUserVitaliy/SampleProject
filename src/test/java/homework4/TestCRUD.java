package homework4;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCRUD {
    @Test
    public void TestSignIn() {
        UserService TestSignIn = new UserService();
        assertEquals(TestSignIn.auth("admin","admin"),true);
    }
    @Test
    public void TestSignIn_1() {
        UserService TestSignIn_1 = new UserService();
        assertEquals(TestSignIn_1.auth("AdmiN","aDmIn"),false);
    }
    @Test
    public void TestSignUp() {
        UserService TestSignUp = new UserService();
        AppUser user = new AppUser("root","toor","root toor",0);
        TestSignUp.addUser(user);
        boolean is_true = false;
        List<AppUser> users = new LinkedList<>(TestSignUp.getAllUsers());
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).equals(user)) {
                is_true = true;
            }
        }
        assertEquals(is_true,true);
    }
    @Test
    public void TestSignUp_1() {
        UserService TestSignUp_1 = new UserService();
        AppUser user = new AppUser("root","toor","root toor",0);
        assertEquals(TestSignUp_1.addUser(user),true);
    }
    @Test
    public void TestSignUp_2() {
        UserService TestSignUp_2 = new UserService();
        AppUser admin = new AppUser("admin","admin","admin",0);
        assertEquals(TestSignUp_2.addUser(admin),false);
    }
    @Test
    public void TestRemoveUser(){
        UserService TestRemoveUser = new UserService();
        AppUser user = new AppUser("root","toor","root toor",0);
        TestRemoveUser.addUser(user);
        TestRemoveUser.deleteUserByLogin(user.getLogin());
        boolean is_true = false;
        if(TestRemoveUser.getAllUsers().get(0).equals(user)) {
            is_true = false;
        } else {
            is_true = true;
        }
        assertEquals(is_true,true);
   }
    @Test
    public void TestRemoveUser_1(){
        UserService TestRemoveUser_1 = new UserService();
        assertEquals(TestRemoveUser_1.deleteUserByLogin("admin"),false);
    }
    @Test
    public void TestRemoveUser_2(){
        UserService TestRemoveUser_2 = new UserService();
        TestRemoveUser_2.addUser(new AppUser("pro","orp","pro orp",0));
        assertEquals(TestRemoveUser_2.deleteUserByLogin("pro"),true);
    }
}
