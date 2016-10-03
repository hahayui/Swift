

import java.util.Scanner;

public class Task1c_PrintSumOfDigits {

    public static void main(String[] args) {
        int a, b = 0;

        Scanner in = new Scanner(System.in);
        a = in.nextInt();

        while (a != 0) {

            b = b + a % 10;
            a = a / 10;
        }

        System.out.println(b);

    }
}
