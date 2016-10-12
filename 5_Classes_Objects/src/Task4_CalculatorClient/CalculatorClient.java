
import java.util.Scanner;

public class CalculatorClient {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String command;

        while (!(command = sc.next().toUpperCase()).equals("END")) {

            double a = sc.nextDouble();

            double b = sc.nextDouble();

            double result;

            switch (command) {

                case "SUM":

                    result = Calculator.sum(a, b);

                    break;

                case "SUB":

                    result = Calculator.subtract(a, b);

                    break;

                case "MUL":

                    result = Calculator.multiply(a, b);

                    break;

                case "DIV":

                    result = Calculator.divide(a, b);

                    break;

                case "PER":

                    result = Calculator.percentage(a, b);

                    break;

                default:

                    // no such command
                    continue;

            }

            System.out.printf("%.3f%n", result);

        }

    }

}
