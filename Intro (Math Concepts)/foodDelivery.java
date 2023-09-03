import java.util.Scanner;

public class foodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickMenu = scanner.nextInt(), fishMenu = scanner.nextInt(), vegMenu = scanner.nextInt();
        double chickCost = 10.35, fishCost = 12.4, vegCost = 8.15;

        double sumMenues = (chickMenu * chickCost) + (fishMenu * fishCost) + (vegMenu * vegCost);
        double dessert = sumMenues * 0.2;
        double delivery = 2.5;

        double sum = sumMenues + delivery + dessert;
        System.out.println(sum);
    }
}
//✅