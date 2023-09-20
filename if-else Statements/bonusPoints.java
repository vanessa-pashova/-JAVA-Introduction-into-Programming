import java.util.Scanner;

public class bonusPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = scanner.nextInt();
        double temp = 0;

        if (points <= 100)
        {
            temp += 5;
            
            if (points % 2 == 0)
                temp++;

            else if (points % 10 == 5)
                temp += 2;
        }

        if (100 < points && points <= 1000)
        {
            temp = (double)points * 0.2;
            
            if (points % 2 == 0)
                temp++;

            else if (points % 10 == 5)
                temp += 2;
        }

        if (1000 < points)
        {
            temp = (double)points * 0.1;
            
            if (points % 2 == 0)
                temp++;

            else if (points % 10 == 5)
                temp += 2;
        }

        System.out.println(temp);
        System.out.println(points + temp);
        scanner.close();
    }
}
//✅