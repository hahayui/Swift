

import java.util.Scanner;

public class Task2c_PrintOnlyEvenNumbers {

    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
      

        int i = 0 ;
        while (i < n) {
            i =scan.nextInt();
            if (i % 2 == 0) {
                System.out.println(i);
            }
            
        }

    }
}
