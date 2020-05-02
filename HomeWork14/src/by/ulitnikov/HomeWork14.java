package by.ulitnikov;

public class HomeWork14 {




    public static void main(String[] args) {
       int[] marks = new int[20] ;
        for (int i = 0; i  < marks.length ; i++){
           marks[i] = (int) (Math.random()*10 +1);
           System.out.println("Ученик № " + (i + 1)  + " = " + marks[i]);
        }
       maxMark(marks);
    }

    public static void maxMark(int[] mark){
        int max = mark[0];
         for (int value : mark) {
            if (max < value) {
                max = value;
            }
         }

        System.out.print("Наивысшая оценка: " + "'" + max + "'" +" встречается у учеников под номерами: ");
        for (int j = 0; j < mark.length ; j++){
        if(mark[j] == max) {
                System.out.print((j + 1) + " ");
            }
        }
        System.out.println(".");
    }
}
