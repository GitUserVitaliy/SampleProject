package lesson9;

import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("src\\main\\resources\\users.txt")) {
            List<Integer> numbers = new LinkedList<>();
            Scanner sc = new Scanner(reader);
            while(sc.hasNextInt()) {
                numbers.add(sc.nextInt());
            }
            float sum = 0f;
            for (int i = 0; i < numbers.size(); i++) {
                sum += numbers.get(i);
            }
            System.out.println(sum/numbers.size());

        } catch (IOException exception) {
            System.out.println("Ошибка при чтении из файла\n" + exception.getMessage());
        }
    }
}

