import java.util.Scanner;

public class anglesFromRadians {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radians = Double.parseDouble(scanner.nextLine());
        double grads = (radians * 180) / Math.PI;

        System.out.println(grads);
    }
}   
//✅