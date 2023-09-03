import java.util.Scanner;

public class concatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String surName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String city = scanner.nextLine();

        System.out.println("You are " + firstName + ' ' + surName + ", a " + age + "-years old person from " + city);
    }
}
//✅