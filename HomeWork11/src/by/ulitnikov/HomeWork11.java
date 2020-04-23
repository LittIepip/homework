package by.ulitnikov;

import java.util.Scanner;

public class HomeWork11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше число: ");
        int i = scanner.nextInt();

        if (i % 2 ==0 || i % 3 ==0 || i == 0 || i == 1){
            System.out.println("Число не является простым");
        }else {
            System.out.println("Число простое");
        }
    }
}
