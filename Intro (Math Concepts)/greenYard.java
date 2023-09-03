import java.util.Scanner;

public class greenYard {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double meters = Double.parseDouble(scanner.nextLine());

            double costsForAllMeters = meters * 7.61;
            double discount = costsForAllMeters * 0.18;
            double discountCost = costsForAllMeters - discount;
            System.out.println("The final price is: " + discountCost + " lv.");
            System.out.println("The discount is: " + discount + " lv.");
    }
}
//✅