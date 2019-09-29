package lesson4;

import java.util.Random;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int n = sc.nextInt();
        int arr[] = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = rnd.nextInt(100);
        }
        System.out.println(sA(arr));
    }
    public static double sA(int arr[]) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result + arr[i];
        }
        return (result / arr.length);
    }
}
