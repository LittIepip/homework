package by.ulitnikov;

import java.util.Scanner;

public class HomeWork10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше число: ");
        int i = scanner.nextInt();
        int sum = 0;

        while(i != 0){

            sum += (i % 10);
            i /= 10;
        }
        System.out.println("Сумма чисел равняется: " + sum );
    }
}
