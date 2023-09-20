import java.util.Scanner;

public class summerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short grads = Short.parseShort(scanner.nextLine());
        String partOfTheDay = scanner.nextLine();

        if (10 <= grads && grads <= 18)
        {
            switch (partOfTheDay)
            {
                case "Morning":
                {
                    System.out.printf("It's %d degrees, get your Sweatshirt and Sneakers.", grads);
                    break;
                }

                case "Afternoon":
                {
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", grads);
                    break;
                }

                case "Evening":
                {
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", grads);
                    break;
                }

                default:
                {
                    System.out.println("error");
                    break;
                }
            }
        }

        else if (18 < grads && grads <= 24)
        {
            switch (partOfTheDay)
            {
                case "Morning":
                {
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", grads);
                    break;
                }

                case "Afternoon":
                {
                    System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", grads);
                    break;
                }

                case "Evening":
                {
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", grads);
                    break;
                }

                default:
                {
                    System.out.println("error");
                    break;
                }
            }
        }

        else if (grads >= 25)
        {
            switch (partOfTheDay)
            {
                case "Morning":
                {
                    System.out.printf("It's %d degrees, get your T-Shirt and Sandals.", grads);
                    break;
                }

                case "Afternoon":
                {
                    System.out.printf("It's %d degrees, get your Swim Suit and Barefoot.", grads);
                    break;
                }

                case "Evening":
                {
                    System.out.printf("It's %d degrees, get your Shirt and Moccasins.", grads);
                    break;
                }

                default:
                {
                    System.out.println("error");
                    break;
                }
            }
        }

        scanner.close();
    }
}
// ✅
