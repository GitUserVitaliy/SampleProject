package homework4;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class TestFileHelper {
    @Test
    public void testWriter() {
        Map<String, AppUser> map = new HashMap<>();
        map.put("Tolya", new AppUser("Tolya", "qwerty", "qwe", 20));
        map.put("a", new AppUser("a", "qwerty", "qwe", 20));
        FileHelper.saveToFile("src\\main\\resources\\users.txt", map, false);
        Map<String, AppUser> maps = FileHelper.readFromFile("src\\main\\resources\\users.txt");
        for (Map.Entry<String, AppUser> current : map.entrySet()) {
            System.out.println(current.getKey() + " : " + current.getValue());
        }
    }
}
