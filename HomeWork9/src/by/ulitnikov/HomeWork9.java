package by.ulitnikov;

public class HomeWork9 {

    public static void main(String[] args) {
	int max = 0;
	int x = (int)(Math.random()*20);

	while (x != 0){
		if(x > max){
			max = x;
		}

	    x = (int)(Math.random()*20);
		System.out.print(x + ", ");
    }
		System.out.println("\n" + "Максимальное значение: " + max);

    }
}
