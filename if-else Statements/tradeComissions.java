import java.util.Scanner;

public class tradeComissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine(); 
        float sells = Float.parseFloat(scanner.nextLine());

        switch (city)
        {
            case "Sofia":
            {
                if (0 <= sells && sells <= 500)
                    System.out.printf("%.2f", sells * 0.05);

                else if (500 < sells && sells <= 1000)
                    System.out.printf("%.2f", sells * 0.07);

                else if (1000 < sells && sells <= 10000)
                    System.out.printf("%.2f", sells * 0.08);

                else if (sells > 10000)
                    System.out.printf("%.2f", sells * 0.12);

                else System.out.println("error");

                break;
            }

            case "Varna":
            {
                if (0 <= sells && sells <= 500)
                    System.out.printf("%.2f", sells * 0.045);

                else if (500 < sells && sells <= 1000)
                    System.out.printf("%.2f", sells * 0.075);

                else if (1000 < sells && sells <= 10000)
                    System.out.printf("%.2f", sells * 0.1);

                else if (sells > 10000)
                    System.out.printf("%.2f", sells * 0.13);

                else System.out.println("error");

                break;
            }

            case "Plovdiv":
            {
                if (0 <= sells && sells <= 500)
                    System.out.printf("%.2f", sells * 0.055);

                else if (500 < sells && sells <= 1000)
                    System.out.printf("%.2f", sells * 0.08);

                else if (1000 < sells && sells <= 10000)
                    System.out.printf("%.2f", sells * 0.12);

                else if (sells > 10000)
                    System.out.printf("%.2f", sells * 0.145);

                else System.out.println("error");

                break;
            }

            default:
            {
                System.out.println("error");
                break;
            }
        }

        scanner.close();
    }
}
// ✅