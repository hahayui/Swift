

import java.util.Scanner;

public class Task1e_IsPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int j = 2;
        int result = 0;
        while (j <= number / 2) {
            if (number % j == 0) {
                result = 1;
            }
            j++;
        }
        if (result == 1) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }

    }
}
