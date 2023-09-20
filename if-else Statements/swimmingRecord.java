import java.util.Scanner;

public class swimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = scanner.nextDouble(), distance = scanner.nextDouble(), distInSecs = scanner.nextDouble();
        double seconds = distInSecs * distance;
        double additional = Math.floor(distance / 15); additional *= 12.5;
        double all = (seconds + additional);
        double toMake = Math.abs(record - all);

        if (record < all)
            System.out.printf("No, he failed! He was %.2f seconds slower.", toMake);
        else
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", all);

        scanner.close();
    }
}
//✅