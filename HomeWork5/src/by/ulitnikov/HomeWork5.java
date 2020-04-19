package by.ulitnikov;

import java.util.Scanner;

public class HomeWork5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше число: ");
	    int i = scanner.nextInt();
	    int q = i % 10;
	    

        if(q == 0 || (i % 100 >= 11 && i % 100 <= 14) || (q >= 5 && q <= 9 )){
            System.out.println( i + " рублей");
        }else if(i % 100 != 11  &&  q == 1){
            System.out.println( i + " рубль");
        }else  {
            System.out.println( i + " рубля");
        }
    }
}
