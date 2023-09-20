import java.util.Scanner;

public class trip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine()), costs = 0;
        String season = scanner.nextLine(), type = "", destination = "";

        switch (season)
        {
            case "summer":
            {
                if (0 <= budget && budget <= 100)
                {
                    destination = "Somewhere in Bulgaria";
                    type = "Camp";
                    costs = budget * 0.3;
                }

                else if (100 < budget && budget <= 1000)
                {
                    destination = "Somewhere in Balkans";
                    type = "Camp";
                    costs = budget * 0.4;
                }

                else if (1000 < budget)
                {
                    destination = "Somewhere in Europe";
                    type = "Hotel";
                    costs = budget * 0.9;
                }

                System.out.printf("%s\n%s - %.2f", destination, type, costs);

                break;
            }

            case "winter":
            {
                if (0 <= budget && budget <= 100)
                {
                    destination = "Somewhere in Bulgaria";
                    type = "Hotel";
                    costs = budget * 0.7;
                }

                else if (100 < budget && budget <= 1000)
                {
                    destination = "Somewhere in Balkans";
                    type = "Hotel";
                    costs = budget * 0.8;
                }

                else if (1000 < budget)
                {
                    destination = "Somewhere in Europe";
                    type = "Hotel";
                    costs = budget * 0.9;
                }

                System.out.printf("%s\n%s - %.2f", destination, type, costs);

                break;
            }
        }

        scanner.close();
    }
}
// ✅