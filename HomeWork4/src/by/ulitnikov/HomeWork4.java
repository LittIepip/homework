package by.ulitnikov;

import java.util.Scanner;

public class HomeWork4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите параметр a: ");
    int a = scanner.nextInt();
        System.out.print("Введите параметр b: ");
    int b = scanner.nextInt();
        System.out.print("Введите радиус r: ");
    int r = scanner.nextInt();

    if ((r * r) >= (a * a + b * b)){
        System.out.println("Накрывает");
    }else {
        System.out.println("Не накрывает");
        }
    }
}
