import java.util.Scanner;

public class booksForSummer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pages = scanner.nextInt(), pagesPerHour = scanner.nextInt(), days = scanner.nextInt();

        int allHours = (pages / pagesPerHour) / days; 

        System.out.println(allHours);
    }
}
//✅