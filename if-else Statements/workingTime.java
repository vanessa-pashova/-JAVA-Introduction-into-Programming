import java.util.Scanner;

public class workingTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short hour = Short.parseShort(scanner.nextLine());
        String day = scanner.nextLine();

        if ((10 <= hour && hour <= 18))
        {
            switch (day)
            {
                case "Monday":
                {
                    System.out.println("open");
                    break;
                }

                case "Tuesday":
                {
                    System.out.println("open");
                    break;
                }

                case "Wednesday":
                {
                    System.out.println("open");
                    break;
                }

                case "Thursday":
                {
                    System.out.println("open");
                    break;
                }

                case "Friday":
                {
                    System.out.println("open");
                    break;
                }

                case "Saturday":
                {
                    System.out.println("open");
                    break;
                }

                case "Sunday": 
                {
                    System.out.println("closed");
                    break;
                }
            }
        }

        else System.out.println("closed");
        scanner.close();
    }
}
//✅