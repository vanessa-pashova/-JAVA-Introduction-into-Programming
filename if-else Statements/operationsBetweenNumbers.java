import java.util.Scanner;

public class operationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short n1 = Short.parseShort(scanner.nextLine()), n2 = Short.parseShort(scanner.nextLine());
        char operator = scanner.next().charAt(0);
        String evenOrOdd = "";

        switch(operator)
        {
            case '+':
            {
                int result = 0;
                result = n1 + n2;

                if (result % 2 == 0)
                    evenOrOdd = "even";

                else evenOrOdd = "odd";

                System.out.printf("%d + %d = %d - %s", n1, n2, result, evenOrOdd);
                break;
            }

            case '-':
            {
                int result = 0;
                result = n1 - n2;

                if (result % 2 == 0)
                    evenOrOdd = "even";

                else evenOrOdd = "odd";

                System.out.printf("%d - %d = %d - %s", n1, n2, result, evenOrOdd);
                break;
            }

            case '*':
            {
                int result = 0;
                result = n1 * n2;

                if (result % 2 == 0)
                    evenOrOdd = "even";

                else evenOrOdd = "odd";

                System.out.printf("%d * %d = %d - %s", n1, n2, result, evenOrOdd);
                break;
            }

            case '/':
            {
                double result = 0.0;
                if (n2 == 0)
                {
                    System.out.printf("Cannot divide %d by zero", n1);
                    break;
                }

                else result = (double)n1 / (double)n2;

                System.out.printf("%d / %d = %.2f", n1, n2, result);
                break;
            }

            case '%':
            {
                int result = 0;
                if (n2 == 0)
                {
                    System.out.printf("Cannot divide %d by zero", n1);
                    break;
                }
                
                else result = n1 % n2;

                System.out.printf("%d %% %d = %d", n1, n2, result);
                break;
            }
        }

        scanner.close();
    }
}
// ✅