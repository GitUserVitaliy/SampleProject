package homework4;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCRUD {
    UserService service = new UserService();
    @Test
    public void TestSignIn() {
        assertEquals(service.auth("admin","admin"),true);
    }
    @Test
    public void TestSignIn_1() {
        assertEquals(service.auth("AdmiN","aDmIn"),false);
    }
    @Test
    public void TestSignUp() {
        AppUser user = new AppUser("root","toor","root toor",0);
        service.addUser(user);
        boolean is_true = false;
        List<AppUser> users = new LinkedList<>(service.getAllUsers());
        for (int i = 0; i < users.size(); i++) {
            if(users.get(i).equals(user)) {
                is_true = true;
            }
        }
        assertEquals(is_true,true);
    }
    @Test
    public void TestSignUp_1() {
        AppUser user = new AppUser("root","toor","root toor",0);
        assertEquals(service.addUser(user),true);
    }
    @Test
    public void TestSignUp_2() {
        AppUser admin = new AppUser("admin","admin","admin",0);
        assertEquals(service.addUser(admin),false);
    }
    @Test
    public void TestRemoveUser(){
        AppUser user = new AppUser("root","toor","root toor",0);
        service.addUser(user);
        service.deleteUserByLogin(user.getLogin());
        boolean is_true = false;
        if(service.getAllUsers().get(0).equals(user)) {
            is_true = false;
        } else {
            is_true = true;
        }
        assertEquals(is_true,true);
   }
    @Test
    public void TestRemoveUser_1(){
        assertEquals(service.deleteUserByLogin("admin"),false);
    }
    @Test
    public void TestRemoveUser_2(){
        service.addUser(new AppUser("pro","orp","pro orp",0));
        assertEquals(service.deleteUserByLogin("pro"),true);
    }
}
