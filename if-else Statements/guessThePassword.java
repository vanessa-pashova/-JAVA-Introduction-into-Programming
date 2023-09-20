import java.util.Scanner;

public class guessThePassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(), password = "s3cr3t!P@ssw0rd";

        if (password.equals(input))
            System.out.println("Welcome");

        else System.out.println("Wrong password!");

        scanner.close();
    }
}
//✅