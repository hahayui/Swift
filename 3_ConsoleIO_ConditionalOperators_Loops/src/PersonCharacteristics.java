
import java.util.Scanner;

public class PersonCharacteristics {

    public static void main(String[] args) {
        short year = 2016;
        Scanner sc = new Scanner(System.in);
        int numberOfPeople = sc.nextInt();
        int i = 0;

        do {
            i++;
            System.out.print("Моля, въведете първото си име:");
            String fName = sc.nextLine();

        }while (numberOfPeople>i);

    }
}
