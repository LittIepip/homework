package by.ulitnikov;

public class HomeWork15 {

    public static void main(String[] args) {
	int[] arr = new int[10];
	for (int i = 0; i < arr.length; i++){
        arr[i] = (int)(Math.random()*10);
        System.out.println(i + ": " + arr[i]);

        }
        Find(arr);
    }
    public static void Find(int[] number){
        int max = number[0];
        int min = number[0];
        int ma = 0;
        int mi = 0;
        int sum = 0;

        for (int i = 0; i < number.length;i++) {
            if (max < number[i]) {
                max = number[i];
                ma = i;
            }else if (min > number[i]) {
                min = number[i];
                mi = i;
            }

        }
        if (ma > mi){
        for (int j = mi; j <= ma; j++) {
            sum += number[j];
            }
        }else{
            for (int j = ma; j <= mi; j++) {
                sum += number[j];
            }
        }

        System.out.println("Максимальное значение: " + max + " на позиции: " + ma);
        System.out.println("Минимальное значение: " + min + " на позиции: " + mi);
        System.out.println("Сумма: " + sum);

    }
}
