import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        short rows = Short.parseShort(scanner.nextLine()), cols = Short.parseShort(scanner.nextLine());

        switch (type)
        {
            case "Premiere":
            {
                System.out.printf("%.2f leva", 12.0 * (float)rows * (float)cols);
                break;
            }

            case "Normal":
            {
                System.out.printf("%.2f leva", 7.5 * (float)rows * (float)cols);
                break;
            }

            case "Discount":
            {
                System.out.printf("%.2f leva", 5.0 * (float)rows * (float)cols);
                break;
            }
        }

        scanner.close();
    }
}
// ✅