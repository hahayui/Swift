

import java.util.Scanner;

public class Task1d_PrintAllDivisors {
      public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        long num = sc.nextInt(), i;
        System.out.print("1 , ");
        for (i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.print(i + " , ");
            }
        }
        System.out.print(num);
        sc.close();
    }
}

