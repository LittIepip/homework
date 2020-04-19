package by.ulitnikov;

import java.util.Scanner;

public class HomeWork2Fix {



    enum Time {
        SEC, MIN, HOUR, DAY, WEEK
    }

    public static void main(String[] args) {
        System.out.print("Введите ваше число: ");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();



        int sec = s % 60;


        int m = (s - sec) / 60;
        int min = m % 60;


        int h = (m - min) / 60;
        int hour = h % 24;


        int d = (h - hour) / 24;
        int day = d % 7;


        int w = (d - day) / 7;
        int week = w;


        String sec1 = Ending(sec, Time.SEC);
        String min1 = Ending(min, Time.MIN);
        String hour1 = Ending(hour, Time.HOUR);
        String day1 = Ending(day, Time.DAY);
        String week1 = Ending(week, Time.WEEK);


        System.out.println( week + " " + week1 + "\n" + day +  " " + day1 + "\n" + hour + " " + hour1 + "\n" + min + " " + min1 + "\n" + sec + " " + sec1);

    }
    static String Ending(int se, Time time){
        int q = se % 10;
        String En = "";

        if (q == 0 || (se % 100 >= 12 && se % 100 <= 14) || (q >= 5 && q <= 9)) {
            if (time == Time.SEC) {
                En = "Секунд";
            } else if (time == Time.MIN) {
                En = "Минут";
            } else if (time == Time.HOUR) {
                En = "Часов";
            } else if (time == Time.DAY) {
                En = "Дней";
            } else if (time == Time.WEEK) {
                En = "Недель";
            }
        } else if (se % 100 != 11 && q == 1) {
            if (time == Time.SEC) {
                En = "Секунда";
            } else if (time == Time.MIN) {
                En = "Минута";
            } else if (time == Time.HOUR) {
                En = "Час";
            } else if (time == Time.DAY) {
                En = "День";
            } else if (time == Time.WEEK) {
                En = "Неделя";
            }
        } else {
            if (time == Time.SEC) {
                En = "Секунды";
            } else if (time == Time.MIN) {
                En = "Минуты";
            } else if (time == Time.HOUR) {
                En = "Часа";
            } else if (time == Time.DAY) {
                En = "Дня";
            } else if (time == Time.WEEK) {
                En = "Недели";
            }
        }


        return En;
    }

}
