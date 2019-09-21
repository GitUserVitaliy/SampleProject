package lesson1;

import java.util.Scanner;

public class Rogue {

    public static void main(String[] args) {
        int bufMoney = 1;
        int totalMoney = 0;
        Scanner sc = new Scanner(System.in);
        for(;bufMoney > 0;) {
            System.out.println("Enter next value->");
            bufMoney = sc.nextInt();
            totalMoney = totalMoney + bufMoney;
        }
        System.out.println("Total money-> " + totalMoney);
    }
}
