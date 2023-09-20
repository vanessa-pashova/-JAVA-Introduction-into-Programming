import java.util.Scanner;

public class note {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int note = scanner.nextInt();

        if (note >= 5)
            System.out.println("Excellent!");

        scanner.close();
    }
}
//✅