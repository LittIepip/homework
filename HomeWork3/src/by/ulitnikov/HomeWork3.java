package by.ulitnikov;

import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {

        System.out.print("Введите любое целое число: ");
        Scanner scanner = new Scanner(System.in);
	    int i = scanner.nextInt();

	    if((i % 10 == 7) || (i % -10 == -7)){
        System.out.println("Семерка на конце числа : " + i + " присутствует ");
        } else {
        System.out.println("Семерка на конце числа : " + i + " отсутствует ");
        }
    }
}
