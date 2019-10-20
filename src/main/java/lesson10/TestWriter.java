package lesson10;

import java.io.FileWriter;
import java.io.IOException;

public class TestWriter {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("src\\main\\resources\\users.txt",true);
            int size = 100;
            long numbers[] = new long[size];
            numbers[0] = 0;
            numbers[1] = 1;
            for (int i = 2; i < numbers.length; i++) {
                numbers[i] = numbers[i - 1] + numbers[i - 2];
            }
            for (int i = 0; i < numbers.length; i++) {

                writer.write(String.valueOf(numbers[i]));
                writer.write(" ");
            }
            writer.write("\n");
            writer.flush();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }
}
