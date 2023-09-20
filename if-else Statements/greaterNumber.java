import java.util.Scanner;

public class greaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();

        if (a > b)
            System.out.println(a);

        else System.out.println(b);
        scanner.close();
    }
}
//