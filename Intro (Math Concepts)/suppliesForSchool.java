import java.util.Scanner;

public class suppliesForSchool {
    public static void main(String[] args) {
        Scanner scnaner = new Scanner(System.in);
        int pens = scnaner.nextInt(), markers = scnaner.nextInt(), liters = scnaner.nextInt(), discount = scnaner.nextInt();
        double pricePens = 5.8, priceMarkers = 7.2, pricePerLiter = 1.2, 

        disc = discount;
        disc /= 100;

        double sum = (pens * pricePens) + (markers * priceMarkers) + (liters * pricePerLiter), 
        discSum = sum - (sum * disc);
        
        System.out.println(discSum);
    }
}
//✅