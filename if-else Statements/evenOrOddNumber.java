import java.util.Scanner;

public class evenOrOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a % 2 == 0)
            System.out.println("even");

        else System.out.println("odd");

        scanner.close();
    }
}
//✅