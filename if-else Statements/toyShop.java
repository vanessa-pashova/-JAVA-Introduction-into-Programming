import java.util.Scanner;

public class toyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double holiday = scanner.nextDouble();
        int puzzels = scanner.nextInt(), barbies = scanner.nextInt(), bears = scanner.nextInt(), minions = scanner.nextInt(), cars = scanner.nextInt(),
        items = puzzels + barbies + bears + minions + cars;
        double pricePuzzel = 2.6, priceBarbie = 3.0, priceBear = 4.1, priceMinions = 8.2, priceCar = 2.0;
        double all = ((double)puzzels * pricePuzzel) + ((double)barbies * priceBarbie) + ((double)bears * priceBear) + ((double)cars * priceCar) + (minions *priceMinions);

        if (items >= 50)
        {
            double discount = all * 0.25;
            all -= discount;
        }

        double rent = all * 0.1;
        all -= rent;
        double rest = Math.abs(all - holiday);
        
        if (holiday <= all)
            System.out.printf("Yes! %.2f lv left.", rest);

        else System.out.printf("Not enough money! %.2f lv needed.", rest);
        scanner.close();
    }
}
//✅