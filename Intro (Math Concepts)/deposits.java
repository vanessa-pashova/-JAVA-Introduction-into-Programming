import java.util.Scanner;

public class deposits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = scanner.nextDouble();
        int period = scanner.nextInt();
        double procent = scanner.nextDouble(), sum = 0;

        sum = deposit + (period * ((deposit * (procent / 100)) / 12));
        System.out.println(sum);
    }
}
//✅