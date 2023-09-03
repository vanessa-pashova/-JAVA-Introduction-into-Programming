import java.util.Scanner;

public class inchesToCents {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double c = Double.parseDouble(scanner.nextLine());
        double i = 0;

        i = c * 2.54;
        System.out.println(i);
    }
}
//✅