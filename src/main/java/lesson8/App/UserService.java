package lesson8.App;

import java.util.*;

public class UserService {
    private Map<String,AppUser> users;
    public UserService() {
        users = new HashMap<>();
        AppUser Admin = new AppUser("admin","admin","admin",0);
        users.put("admin",Admin);
    }
    public AppUser getUserByLogin(String login) {
        return users.get(login);
    }
    public boolean addUser(AppUser user) {
        for (Map.Entry<String,AppUser> pair : users.entrySet()) {
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
    public List<AppUser> getAllUsers(){
        return new LinkedList<>(users.values());
    }
    public boolean editUser(AppUser user){
        for (Map.Entry<String,AppUser> pair : users.entrySet()) {
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
            AppUser user = users.get(login);
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
