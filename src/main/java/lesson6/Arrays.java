package lesson6;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Locale;

public class Arrays {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Faker faker = new Faker(new Locale("ru"));
        int num = 20;
        for (int i = 0; i < num; i++) {
            list.add(faker.chuckNorris().fact());
        }
        for (int i = 0; i < num; i++) {
            System.out.println(list.get(i));
        }
        for (int i = 0; i < num; i++) {
            if (list.get(i).startsWith("Chuck Norris")) {
                continue;
            } else {
                list.remove(i);
                num--;
                i--;
            }
        }
        System.out.println("------------");
        for (int i = 0; i < num; i++) {
            System.out.println(list.get(i));
        }
    }

}
