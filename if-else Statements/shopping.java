import java.util.Scanner;

public class shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = scanner.nextDouble();
        int videoCars = scanner.nextInt(), GPUs = scanner.nextInt(), ram = scanner.nextInt();
        double priceCard = 250, priceGPU = (videoCars * priceCard) * 0.35, priceRam = (videoCars * priceCard) * 0.1,
        all = (videoCars * priceCard) + (GPUs * priceGPU) + (ram * priceRam); 

        if (videoCars > GPUs)
            all -= (all * 0.15);

        double difference  = Math.abs(budget - all);

        if (budget < all)
            System.out.printf("Not enough money! You need %.2f leva more!", difference);

        else System.out.printf("You have %.2f leva left!", difference);
        scanner.close();
    }
}
//✅