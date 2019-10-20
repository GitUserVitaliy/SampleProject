package homework4;

import java.util.*;

public class UserService {
    private Map<String, AppUser> users;
    private AppUser Admin = new AppUser("admin","admin","admin",0);
    private final String path = "src\\main\\java\\homework4\\users.txt";
    public UserService() {
        users = FileHelper.readFromFile(path);
        users.put("admin",Admin);
    }
    public AppUser getUserByLogin(String login) {
        return users.get(login);
    }
    public boolean addUser(AppUser user) {
        for (Map.Entry<String, AppUser> pair : users.entrySet()) {
            if(user.equals(pair.getValue()) || user.getLogin().equals(Admin.getLogin())) {
                return false;
            }
        }
        users.put(user.getLogin(),user);
        return true;
    }
    public boolean deleteUserByLogin(String login){
        if(login.equals("admin")) {
            return false;
        } else {
            if(users.containsKey(login)) {
                users.remove(login);
                return true;
            } else {
                return false;
            }
        }
    }
    public List<AppUser> getAllUsers(){
        return new LinkedList<>(users.values());
    }
    public boolean editUser(AppUser user){
        if(Admin.getLogin().equals(user.getLogin())) {
            return false;
        } else {
            for (Map.Entry<String, AppUser> pair : users.entrySet()) {
                if(pair.getKey().equals(user.getLogin())) {
                    users.remove(user.getLogin());
                    users.put(user.getLogin(),user);
                    return true;
                }
            }
            return false;
        }
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
    public void saveUsers() {
        FileHelper.saveToFile(path,users,false);
    }
}
