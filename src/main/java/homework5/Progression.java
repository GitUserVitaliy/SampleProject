package homework5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Progression {
    public static boolean isArithmeticalProgression(List<Integer> numList) {
        int key = numList.get(1) - numList.get(0);
        int bufNum = numList.get(0);
        if(key == 0) {
            return false;
        }
        for (int i = 0; i < numList.size(); i++) {
            if(i != 0) {
                bufNum += key;
            }
            if(!numList.get(i).equals(bufNum)) {
                return false;
            }
        }
        return true;
    }
    public static boolean isGeometricalProgression(List<Integer> numList) {
        if(numList.get(0) == 0) {
            return false;
        }
        int key = numList.get(1) / numList.get(0);
        int bufNum = numList.get(0);
        if(key == 0) {
            return false;
        }
        for (int i = 0; i < numList.size(); i++) {
            if(i != 0) {
                bufNum *= key;
            }
            if(!numList.get(i).equals(bufNum)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)  {
        try {
            FileReader fileReader = new FileReader("src\\main\\java\\homework5\\num.txt");
            Scanner scanner = new Scanner(fileReader);
            List<Integer> numList = new LinkedList<>();
            while(scanner.hasNextInt()) {
                numList.add(scanner.nextInt());
            }
            if(numList.size() > 0) {
                if(isGeometricalProgression(numList)) {
                    System.out.println("isGeometricalProgression");
                } else {
                    if(isArithmeticalProgression(numList)) {
                        System.out.println("isArithmeticalProgression");
                    } else {
                        System.out.println("isSnaff");
                    }
                }

            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }


}
