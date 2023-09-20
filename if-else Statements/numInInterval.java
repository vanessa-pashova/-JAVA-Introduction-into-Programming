import java.util.Scanner;

public class numInInterval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short num = Short.parseShort(scanner.nextLine());

        if ((-100 <= num && num <= 100) && (num != 0))
            System.out.println("Yes");

        else System.out.println("No");

        scanner.close();
    }
}
//✅
