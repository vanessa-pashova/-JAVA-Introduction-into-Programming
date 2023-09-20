import java.util.Scanner;

public class invalidNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short num = Short.parseShort(scanner.nextLine());

        if (!(100 <= num && num <= 200) && (num != 0))
            System.out.println("invalid");

        scanner.close();
    }
}
//✅