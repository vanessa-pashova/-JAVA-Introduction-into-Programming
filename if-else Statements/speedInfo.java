import java.util.Scanner;

public class speedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed = scanner.nextDouble();

        if (speed <= 10)
            System.out.println("slow");

        else if (10.0 < speed && speed <= 50)
            System.out.println("average");

        else if (50.0 < speed && speed <= 150)
            System.out.println("fast");

        else if (150.0 < speed && speed <= 1000)
            System.out.println("ultra fast");

        else if (1000.0 < speed)
            System.out.println("extremely fast");

        scanner.close();
    }
}
//✅