
import java.util.Arrays;
import java.util.Scanner;

public class Task2b_PrintReversedSequence {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        int length = array.length;
        int[] reversed = new int[length];

        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
            for (int index = 0; index < length; index++) {
                reversed[length - index - 1] = array[index];

            }
        }
        System.out.println(Arrays.toString(reversed));
    }

}
