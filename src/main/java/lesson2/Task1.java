package lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
         int f_num = sc.nextInt();
        System.out.println("Enter second number: ");
         int s_num = sc.nextInt();
        System.out.println("Enter third number: ");
         int t_num = sc.nextInt();
        if (f_num > s_num && f_num > t_num) {
            System.out.println(f_num);
        }
        if (s_num > f_num && s_num > t_num) {
            System.out.println(s_num);
        }
        if (t_num > s_num && t_num > f_num) {
            System.out.println(f_num);
        }
    }
}
