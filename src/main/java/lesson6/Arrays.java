package lesson6;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class Arrays {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Faker faker = new Faker(new Locale("ru"));

        int num = 20;
        for (int i = 0; i < num; i++) {
            list.add(faker.dog().age());
        }
        for (int i = 0; i < num; i++) {
            System.out.println(list.get(i));
        }
        Set<String> strings = new HashSet<>(list);
        System.out.println("------------");
        for (String x:strings) {
            System.out.println(x);
        }


    }

}
