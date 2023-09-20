import java.util.Scanner;

public class fishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short budget = Short.parseShort(scanner.nextLine());
        String season = scanner.nextLine();
        short fishers = Short.parseShort(scanner.nextLine());

        double rent = 0, discount = 0, endPrice = 0;

        switch (season)
        {
            case "Spring":
            {
                rent = 3000;
                break;
            }

            case "Summer":
            {
                rent = 4200;
                break;
            }

            case "Autumn":
            {
                rent = 4200;
                break;
            }

            case "Winter":
            {
                rent = 2600;
                break;
            }

            default:
            {
                System.out.println("error");
                break;
            }
        }

        if (fishers <= 6)
        {
            discount = rent * 0.1;
            endPrice = rent - discount;
        }

        else if (7 <= fishers && fishers <= 11)
        {
            discount = rent * 0.15;
            endPrice = rent - discount;
        }

        else if (fishers >= 12)
        {
            discount = rent * 0.25;
            endPrice = rent - discount;
        }

        else if (0 < fishers && fishers < 6)
            endPrice = rent;

        if ((fishers % 2 == 0) && !"Autumn".equals(season))
            endPrice = endPrice - (endPrice * 0.05);

        if (endPrice <= budget)
            System.out.printf("Yes! You have %.2f leva left.", (budget - endPrice));
        
        else System.out.printf("Not enough money! You need %.2f leva.", (endPrice - budget));
        scanner.close();
    }
}
// ✅
