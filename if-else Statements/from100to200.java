import java.util.Scanner;

public class from100to200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a < 100)
            System.out.println("Less than 100");

        else if (100 <= a && a <=200)
            System.out.println("Between 100 and 200");

        else System.out.println("Greater than 200");
        scanner.close();
    }
}
//✅