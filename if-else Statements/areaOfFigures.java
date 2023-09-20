import java.util.Scanner;

public class areaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();

        if (figure.equals("square"))
        {
            double a = scanner.nextDouble();
            System.out.printf("%.3f",(a * a));
        }

        else if (figure.equals("rectangle"))
        {
            double a = scanner.nextDouble(), b = scanner.nextDouble();
            System.out.printf("%.3f", a * b);
        }

        else if (figure.equals("circle"))
        {
            double r = scanner.nextDouble();
            System.out.printf("%.3f",Math.PI * r * r);
        }

        else if (figure.equals("triangle"))
        {
            double a = scanner.nextDouble(), h = scanner.nextDouble();
            System.out.printf("%.3f",(a * h) / 2);
        }

        scanner.close();
    }
}
//✅
