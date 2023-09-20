import java.util.Scanner;

public class ageAndS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        if ("f".equals(gender))
        {
            if (age >= 16)
                System.out.println("Ms.");

            if (0 <= age && age < 16)
                System.out.println("Miss");
        }

        else if ("m".equals(gender))
        {
            if (age >= 16)
                System.out.println("Mr.");

            if (0 <= age && age < 16)
                System.out.println("Master");
        }

        scanner.close();
    }
}
//✅