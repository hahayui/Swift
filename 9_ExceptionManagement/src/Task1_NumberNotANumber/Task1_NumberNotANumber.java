package Task1_NumberNotANumber;

import java.util.Scanner;

public class Task1_NumberNotANumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        do {
            str = sc.nextLine();
            try {
                if (str.equals("END")) {
                    break;
                }
                Integer.parseInt(str);

                System.out.println("NUMBER");

            } catch (Exception y) {
                System.out.println("NOT A NUMBER");

            }
        } while (!str.equals("END"));

    }

}
