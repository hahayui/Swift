

import java.util.Scanner;

public class Task1a_PrintFirstDigit {

    public static void main(String[] args) {
        Scanner newNumber = new Scanner(System.in);
        int a = newNumber.nextInt();
        while (a >= 10) {
            a = a / 10;
        }
        System.out.println(a);
    }
}
