package by.ulitnikov;

import java.util.Scanner;

public class HomeWork13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше число: ");
        int i = scanner.nextInt();
        FindSimple(i);
    }

    public static void FindSimple(int a){
        if (a == 0 || a == 1){
            System.out.println("Не является простым числом");
        }
        for (int i = 2; i <= a; i++) {
            Integer result = i;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    result = null;
                    break;
                }
            }
            if (result != null) {
                System.out.println(result);
            }
        }
    }
}
