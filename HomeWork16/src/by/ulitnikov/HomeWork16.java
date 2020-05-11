package by.ulitnikov;

public class HomeWork16 {

    public static void main(String[] args) {
	int[] arr = new int[10];
	System.out.println("Оригинальный массив: ");
    for(int i = 0;i < arr.length;i++){
        arr[i] = (int)(Math.random()*10);
        System.out.print(arr[i] + " ");
    }
        System.out.println( );
        Rever(arr);
        Rever1(arr);

    }
    public static void Rever(int[] number){
        System.out.println("Перевернутый массив с обратной печатью: ");
        for (int i = number.length - 1; i >= 0; i--){
            System.out.print(number[i] + " ");
        }
        System.out.println( );
    }
    public static void Rever1(int[] number1){
        for(int i = 0; i < number1.length / 2; i++){
            int j = number1[i];
            number1[i] = number1[number1.length - i - 1];
            number1[number1.length - i - 1] = j;
        }
        System.out.println("Перевернутый массив с перестановкой: ");
        for (int i=0; i<number1.length; i++) {
            System.out.print(number1[i] + " ");
        }
    }
}
