package by.ulitnikov;

import java.util.Scanner;

public class HomeWork8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше число: ");
        int n = scanner.nextInt();
        int res = 1;
        int i = 1;

    while (i <= n) {
        res = res * i;
        i++;
        }
        System.out.println(n + "!= " + res);
    }
}
