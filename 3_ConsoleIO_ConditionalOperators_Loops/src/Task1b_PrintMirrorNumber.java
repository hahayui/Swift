

import java.util.Scanner;

public class Task1b_PrintMirrorNumber {

    public static void main(String[] args) {
        int n, reverse = 0;

        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        while (n != 0) {
            reverse *= 10;
            reverse = reverse + n % 10;
            n = n / 10;
        }

        System.out.println(reverse);

    }
}
