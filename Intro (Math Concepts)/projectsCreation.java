import java.util.Scanner;

public class projectsCreation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int neededTime = count * 3;

        System.out.println("The architect " + name + " will need " + neededTime + " hours to complete " + count + " project/s.");
    }
}
//✅