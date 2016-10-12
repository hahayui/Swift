
import java.util.Scanner;

public class EmployeeSalarySort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sc.nextLine();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();

            String[] split = line.split(",");

            String name = split[0].trim();

            double salary = Double.parseDouble(split[1].trim());

            String position = split[2].trim();

            String department = split[3].trim();

            switch (split.length) {

                case 4:

                    employees[i] = new Employee(name, salary, position, department);

                    break;

                case 5:

                    if (split[4].contains("@")) {

                        String email = split[4].trim();

                        employees[i] = new Employee(name, salary, position, department, email);

                    } else {

                        int age = Integer.parseInt(split[4].trim());

                        employees[i] = new Employee(name, salary, position, department, age);

                    }

                    break;

                case 6:

                    short age = Short.parseShort(split[4].trim());

                    String email = split[5].trim();

                    employees[i] = new Employee(name, salary, position, department, age, email);

                    break;

                default:

                    // should be impossible
                    break;

            }

        }

        for (int i = 0; i < 3; i++) {

            double max = 0;

            int idx = 0;

            for (int j = 0; j < n; j++) {

                if ((employees[j] != null) && (max < employees[j].salary)) {

                    max = employees[j].salary;

                    idx = j;

                }

            }

            System.out.printf("%s, %s, %s", employees[idx].name, employees[idx].department, employees[idx].position);

            if (employees[idx].email != null) {

                System.out.printf(",%s", employees[idx].email);

            }

            employees[idx] = null;

            System.out.println();

        }

    }

}
