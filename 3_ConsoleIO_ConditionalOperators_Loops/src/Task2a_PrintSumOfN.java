

import java.util.Scanner;

public class Task2a_PrintSumOfN {
     public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 0;

        do {

            i = scan.nextInt();

            sum += i;
            --n;
        } while (n > 0);

        System.out.println("Сборът от числата е: " + sum);

    }
}

