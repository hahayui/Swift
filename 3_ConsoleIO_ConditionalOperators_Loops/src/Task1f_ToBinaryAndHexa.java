

import java.util.Scanner;

public class Task1f_ToBinaryAndHexa {

    public static void main(String[] args) {
        int i, n, sum = 0, num;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        
        System.out.println(Integer.toBinaryString(n));
       
        System.out.printf("Шестнадесетично : %x . \n" , n);//Конвертиране със спецификатор
    }

}