import java.util.Scanner;

public class timePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt(), minutes = scanner.nextInt();

        minutes += 15;
        if (59 < minutes)
        {
            hour++;
            minutes = Math.abs(60 - minutes);
        }

        if (hour > 23)
            hour = 0;

        if (minutes < 10)
            System.out.printf("%d:0%d",hour, minutes);

        else System.out.printf("%d:%d", hour, minutes);

        scanner.close();
    }
}
//✅