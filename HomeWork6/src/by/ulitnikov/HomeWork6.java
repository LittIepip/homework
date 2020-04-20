package by.ulitnikov;


import java.util.Scanner;

public class HomeWork6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день:");
        byte day = scanner.nextByte();

        System.out.print("Введите месяц:");
        byte month = scanner.nextByte();

        System.out.print("Введите год:");
        int year = scanner.nextInt();


        //Проверка входимости введенных параметров
        if (day <= 0 || month <= 0 || month > 12 || year <= 0) {
            System.out.println("Некорректное указание даты");
        } else if ((day > 30) && (month == 4 || month == 6 || month == 9 || month == 11)) {
            System.out.println("В месяце " + " всего 30 день");
        } else if ((day > 31) && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)) {
            System.out.println("В месяце " + " всего 31 день");
        } else if ((month == 2) && (day > 29) && (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Високосный февраль");
        } else {

        }


        if ((day == 30) && (month == 4 || month == 6 || month == 9 || month == 11)) {
            day = 1;
            month++;
            System.out.print("Следующий день: " + day + "." + month + "." + year);
        } else if ((day == 31) && month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
            day = 1;
            month++;
            System.out.print("Следующий день: " + day + "." + month + "." + year);
        } else if ((month == 12) && (day == 31)) {
            day = 1;
            month = 1;
            year++;
            System.out.print("Следующий день: " + day + "." + month + "." + year);
        } else if((month == 2) && (day == 28) && (year % 4 == 0 && year % 100 != 0) && (year % 400 == 0)){
            day = 1;
            month ++;
            System.out.print("Следующий день: " + day + "." + month + "." + year);
        } else if ((month == 2) && (day == 29) && !(year % 4 == 0 && year % 100 != 0 && year % 400 == 0)) {
            day = 1;
            month++;
            System.out.print("Следующий день: " + day + "." + month + "." + year);
        } else {
            day++;
            System.out.print("Следующий день: " + day + "." + month + "." + year);
        }


    }

    }
