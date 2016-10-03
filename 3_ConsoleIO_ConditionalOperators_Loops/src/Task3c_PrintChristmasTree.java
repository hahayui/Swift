
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class Task3c_PrintChristmasTree {

    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        int temp = scan.nextInt();
        int x = (temp - 1) * 2 + 1;

        int y = x / 2;  // calculate how many spaces you need to print before the stump
        int z = 1;  // initial #of * you need to print
        for (int i = 0; i < temp; i++) //determines how many lines you print 
        {

            for (int j = 0; j <= y; j++) //determines how many spaces you print
            {

                out.print(" ");

            }
            for (int k = 0; k < z; k++) // determines how many * you print 
            {

                out.print("*");

            }
            out.println();

            y--;

            z += 2; //add 2 for the 1,3,5,7 increment

        }

        for (int i = 0; i <= x / 2; i++) 
        {

            out.print(" ");
 
        }

        out.println("*"); 
       
    }
}
