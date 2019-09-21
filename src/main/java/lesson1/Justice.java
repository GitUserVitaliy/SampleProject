package lesson1;

import java.util.Scanner;

public class Justice {

    public static void main(String[] args) {
        int money = 0;
        int countFamily = 0;
        int price = 0;
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter money: ");
        money = sc.nextInt();
         System.out.println("Enter the number of family members: ");
        countFamily = sc.nextInt();
         System.out.println("Enter price: ");
        price = sc.nextInt();
        if(money >= 0 && countFamily >=0 && price >= 0) {
            if ((money - (countFamily * price)) >= 0) {
                System.out.println("Yes");
                System.out.println("Surrender: " + (money - (countFamily * price)));
            } else {
                System.out.println("no");
            }
        }
        else {
            System.out.println("Error");
            System.exit(0);
        }
    }
}