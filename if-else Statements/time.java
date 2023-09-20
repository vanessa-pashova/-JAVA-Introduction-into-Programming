import java.util.Scanner;

public class time {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
        int totalTime = a + b + c;

        int minutes = totalTime / 60;
        int seconds = totalTime % 60;

        if (seconds < 10)
            System.out.printf("%d:0%d", minutes, seconds);
        
        else System.out.printf("%d:%d", minutes, seconds);
        
        scanner.close();
    }
}
//✅