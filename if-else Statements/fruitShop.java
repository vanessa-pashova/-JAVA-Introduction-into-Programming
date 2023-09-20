import java.util.Scanner;

public class fruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine(), day = scanner.nextLine();
        float count = Float.parseFloat(scanner.nextLine());

        switch (fruit)
        {
            case "banana":
            {
                switch (day)
                {
                    case "Monday":
                    {
                        System.out.printf("%.2f", count * 2.5);
                        break;
                    }

                    case "Tuesday":
                    {
                        System.out.printf("%.2f", count * 2.5);
                        break;
                    }

                    case "Wednesday":
                    {
                        System.out.printf("%.2f", count * 2.5);
                        break;
                    }

                    case "Thursday":
                    {
                        System.out.printf("%.2f", count * 2.5);
                        break;
                    }

                    case "Friday":
                    {
                        System.out.printf("%.2f", count * 2.5);
                        break;
                    }

                    case "Saturday":
                    {
                        System.out.printf("%.2f", count * 2.7);
                        break;
                    }

                    case "Sunday":
                    {
                        System.out.printf("%.2f", count * 2.7);
                        break;
                    }

                    default:
                    {
                        System.out.println("error");
                        break;
                    }
                }

                break;
            }

            case "apple":
            {
                switch (day)
                {
                    case "Monday":
                    {
                        System.out.printf("%.2f", count * 1.2);
                        break;
                    }

                    case "Tuesday":
                    {
                        System.out.printf("%.2f", count * 1.2);
                        break;
                    }

                    case "Wednesday":
                    {
                        System.out.printf("%.2f", count * 1.2);
                        break;
                    }

                    case "Thursday":
                    {
                        System.out.printf("%.2f", count * 1.2);
                        break;
                    }

                    case "Friday":
                    {
                        System.out.printf("%.2f", count * 1.2);
                        break;
                    }

                    case "Saturday":
                    {
                        System.out.printf("%.2f", count * 1.25);
                        break;
                    }

                    case "Sunday":
                    {
                        System.out.printf("%.2f", count * 1.25);
                        break;
                    }

                    default:
                    {
                        System.out.println("error");
                        break;
                    }
                }

                break;
            }

            case "orange":
            {
                switch (day)
                {
                    case "Monday":
                    {
                        System.out.printf("%.2f", count * 0.85);
                        break;
                    }

                    case "Tuesday":
                    {
                        System.out.printf("%.2f", count * 0.85);
                        break;
                    }

                    case "Wednesday":
                    {
                        System.out.printf("%.2f", count * 0.85);
                        break;
                    }

                    case "Thursday":
                    {
                        System.out.printf("%.2f", count * 0.85);
                        break;
                    }

                    case "Friday":
                    {
                        System.out.printf("%.2f", count * 0.85);
                        break;
                    }

                    case "Saturday":
                    {
                        System.out.printf("%.2f", count * 0.9);
                        break;
                    }

                    case "Sunday":
                    {
                        System.out.printf("%.2f", count * 0.9);
                        break;
                    }

                    default:
                    {
                        System.out.println("error");
                        break;
                    }
                } 

                break;
            }

            case "grapefruit":
            {
                switch (day)
                {
                    case "Monday":
                    {
                        System.out.printf("%.2f", count * 1.45);
                        break;
                    }

                    case "Tuesday":
                    {
                        System.out.printf("%.2f", count * 1.45);
                        break;
                    }

                    case "Wednesday":
                    {
                        System.out.printf("%.2f", count * 1.45);
                        break;
                    }

                    case "Thursday":
                    {
                        System.out.printf("%.2f", count * 1.45);
                        break;
                    }

                    case "Friday":
                    {
                        System.out.printf("%.2f", count * 1.45);
                        break;
                    }

                    case "Saturday":
                    {
                        System.out.printf("%.2f", count * 1.6);
                        break;
                    }

                    case "Sunday":
                    {
                        System.out.printf("%.2f", count * 1.6);
                        break;
                    }

                    default:
                    {
                        System.out.println("error");
                        break;
                    }
                }

                break;
            }

            case "kiwi":
            {
                switch (day)
                {
                    case "Monday":
                    {
                        System.out.printf("%.2f", count * 2.7);
                        break;
                    }

                    case "Tuesday":
                    {
                        System.out.printf("%.2f", count * 2.7);
                        break;
                    }

                    case "Wednesday":
                    {
                        System.out.printf("%.2f", count * 2.7);
                        break;
                    }

                    case "Thursday":
                    {
                        System.out.printf("%.2f", count * 2.7);
                        break;
                    }

                    case "Friday":
                    {
                        System.out.printf("%.2f", count * 2.7);
                        break;
                    }

                    case "Saturday":
                    {
                        System.out.printf("%.2f", count * 3.0);
                        break;
                    }

                    case "Sunday":
                    {
                        System.out.printf("%.2f", count * 3.0);
                        break;
                    }
                    
                    default:
                    {
                        System.out.println("error");
                        break;
                    }
                }

                break;
            }

            case "pineapple":
            {
                switch (day)
                {
                    case "Monday":
                    {
                        System.out.printf("%.2f", count * 5.50);
                        break;
                    }

                    case "Tuesday":
                    {
                        System.out.printf("%.2f", count * 5.50);
                        break;
                    }

                    case "Wednesday":
                    {
                        System.out.printf("%.2f", count * 5.50);
                        break;
                    }

                    case "Thursday":
                    {
                        System.out.printf("%.2f", count * 5.50);
                        break;
                    }

                    case "Friday":
                    {
                        System.out.printf("%.2f", count * 5.50);
                        break;
                    }

                    case "Saturday":
                    {
                        System.out.printf("%.2f", count * 5.60);
                        break;
                    }

                    case "Sunday":
                    {
                        System.out.printf("%.2f", count * 5.60);
                        break;
                    }
                    
                    default:
                    {
                        System.out.println("error");
                        break;
                    }
                }

                break;
            }

            case "grapes":
            {
                switch (day)
                {
                    case "Monday":
                    {
                        System.out.printf("%.2f", count * 3.85);
                        break;
                    }

                    case "Tuesday":
                    {
                        System.out.printf("%.2f", count * 3.85);
                        break;
                    }

                    case "Wednesday":
                    {
                        System.out.printf("%.2f", count * 3.85);
                        break;
                    }

                    case "Thursday":
                    {
                        System.out.printf("%.2f", count * 3.85);
                        break;
                    }

                    case "Friday":
                    {
                        System.out.printf("%.2f", count * 3.85);
                        break;
                    }

                    case "Saturday":
                    {
                        System.out.printf("%.2f", count * 4.2);
                        break;
                    }

                    case "Sunday":
                    {
                        System.out.printf("%.2f", count * 4.2);
                        break;
                    }

                    default:
                    {
                        System.out.println("error");
                        break;
                    }
                }

                break;
            }

            default:
            {
                System.out.println("error");
                break;
            }
        }

        scanner.close();
    }
}
//✅