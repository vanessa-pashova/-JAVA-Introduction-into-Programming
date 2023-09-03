import java.util.Scanner;

public class zooShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int packegesDogs = Integer.parseInt(scanner.nextLine());
        int packegesCats = Integer.parseInt(scanner.nextLine());

        double costsDogs = packegesDogs * 2.5;
        double costsCats = packegesCats * 4;
        double result = costsCats + costsDogs;

        System.out.println(result + " lv.");
    }
}
//✅