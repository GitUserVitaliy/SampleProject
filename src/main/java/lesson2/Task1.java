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
        if (f_num <= s_num && f_num <= t_num) {
            System.out.println("Min-> " + f_num);
        } else {
            if (s_num <= f_num && s_num <= t_num) {
                System.out.println("Min-> " + s_num);
            } else {
                System.out.println("Min-> " + t_num);
            }
        }
        System.out.println("Min-> " + minForThree(f_num,s_num,t_num));
    }
    public static int minForThree(int a, int b,int c) {
            if (a <= b && a <= c) {
            return a;
        } else {
            if (b <= a && b <= c) {
                return b;
            } else {
                return c;
            }
        }
    }
}


