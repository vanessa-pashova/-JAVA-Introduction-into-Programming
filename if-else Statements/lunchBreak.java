import java.util.Scanner;

public class lunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        int duration = scanner.nextInt(), allBreaks = scanner.nextInt();

        double lunchTime = (double)allBreaks / 8, chillTime = (double)allBreaks * (0.25), rest = Math.abs(allBreaks - lunchTime - chillTime),
        otherTime = Math.ceil(Math.abs(duration - rest));

        if (rest >= duration)
            System.out.println("You have enough time to watch " + title + " and left with " + (int)otherTime + " minutes free time.");
        
        else System.out.println("You don't have enough time to watch " + title + ", you need " + (int)otherTime + " more minutes.");
        
        scanner.close();
    }
}
//✅