package lesson6;

import com.github.javafaker.Faker;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class MapExample {
    public static void main(String[] args) {
        Faker faker = new Faker(new Locale("ru"));
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(faker.name().firstName(),Math.abs(new Random().nextInt()));
        }
        for (Map.Entry<String,Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }
}
