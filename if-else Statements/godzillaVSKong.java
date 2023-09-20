import java.util.Scanner;

public class godzillaVSKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = scanner.nextDouble();
        int stats = scanner.nextInt();
        double priceClothes = scanner.nextDouble(), decor = budget * 0.1;

        if (stats > 150)
            priceClothes -= (priceClothes * 0.1);

        double needed = decor + (priceClothes * stats), rest = Math.abs(needed - budget);


        if (needed > budget)
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.", rest);

        else System.out.printf("Action!\nWingard starts filming with %.2f leva left.", rest);

        scanner.close();
    }
}
//✅