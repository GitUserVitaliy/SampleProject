package lesson8.App;

import java.util.*;

public class UserService_OLD {
    private Map<String, AppUser_OLD> users;
    public UserService_OLD() {
        users = new HashMap<>();
        AppUser_OLD Admin = new AppUser_OLD("admin","admin","admin",0);
        users.put("admin",Admin);
    }
    public AppUser_OLD getUserByLogin(String login) {
        return users.get(login);
    }
    public boolean addUser(AppUser_OLD user) {
        for (Map.Entry<String, AppUser_OLD> pair : users.entrySet()) {
            if(user.equals(pair.getValue())) {
                return false;
            }
        }
        users.put(user.getLogin(),user);
        return true;
    }
    public boolean deleteUserByLogin(String login){
        if(users.containsKey(login)) {
            users.remove(login);
            return true;
        } else {
            return false;
        }
    }
    public List<AppUser_OLD> getAllUsers(){
        return new LinkedList<>(users.values());
    }
    public boolean editUser(AppUser_OLD user){
        for (Map.Entry<String, AppUser_OLD> pair : users.entrySet()) {
            if(pair.getKey().equals(user.getLogin())) {
                users.remove(user.getLogin());
                users.put(user.getLogin(),user);
                return true;
            }
        }
        return false;
    }
    public boolean auth(String login,String password){
        if(users.containsKey(login)){
            AppUser_OLD user = users.get(login);
            if(user.getPassword().equals(password)){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}