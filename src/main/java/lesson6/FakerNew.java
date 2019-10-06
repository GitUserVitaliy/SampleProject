package lesson6;

import com.github.javafaker.Faker;

import java.util.Locale;

public class FakerNew {
    public static void main(String[] args) {
        Faker faker = new Faker(new Locale("ru"));
        for (int i = 0; i < 10; i++) {
            System.out.println(faker.artist().name());
        }
    }
}


