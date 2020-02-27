package by.ulitnikov;

public class HomeWork2 {

    public static void main(String[] args) {
	int s = 5000455;

	int sec = s % 60;

	int m = (s - sec ) / 60;
	int min = m % 60;

	int h = (m - min) / 60;

		int w = s % 604800;
		int week = (s - w) / 604800;
		if (week != 0){
			System.out.println(week + " недель ");
		}else{
			System.out.println("unexpected condition");
		}

		int d = s % 86400;
		int day = (s - d) / 86400;
		if (day != 0){
			System.out.println(day + " дней ");
		}else{
			System.out.println("unexpected condition");
		}


		System.out.println( + h  + " часов \n" + min + " минут \n" +sec+ " секунд \n" );
    }
}
