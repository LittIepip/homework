package by.ulitnikov;

import java.util.Scanner;

public class HomeWork7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Дом первый
        System.out.print("Введите парамметр a: ");
        int a  = scanner.nextInt();

        System.out.print("Введите парамметр b: ");
        int b  = scanner.nextInt();




        //Дом второй
        System.out.print("Введите парамметр c: ");
        int c  = scanner.nextInt();

        System.out.print("Введите парамметр d: ");
        int d  = scanner.nextInt();




        //Размер участка
        System.out.print("Введите парамметр e: ");
        int e  = scanner.nextInt();

        System.out.print("Введите парамметр f: ");
        int f  = scanner.nextInt();



        //Разнообразные взаимодействия сторон домов со сторонами участка
        if ((e >= (a + c)) && (f >= b && f >= d)) {
            System.out.println("Оба дома помещаются");

        } else if ((e >= (a + d)) && (f >= b && f >= c)) {
            System.out.println("Оба дома помещаются");

        } else if ((e >= (b + c)) && (f >= a && f >= d)) {
            System.out.println("Оба дома помещаются");

        } else if ((e >= (b + d)) && (f >= a && f >= c)) {
            System.out.println("Оба дома помещаются");

        } else if ((f >= (a + c)) && (e >= b && e >= d)) {
            System.out.println("Оба дома помещаются");

        } else if ((f >= (a + d)) && (e >= b && e >= c)) {
            System.out.println("Оба дома помещаются");

        } else if ((f >= (b + c)) && (e >= a && e >= d)) {
            System.out.println("Оба дома помещаются");

        } else if ((f >= (b + d)) && (e >= a && e >= c)) {
            System.out.println("Оба дома помещаются");
        }
        else
            System.out.println("Оба дома поместиться не могут");
    }
}


