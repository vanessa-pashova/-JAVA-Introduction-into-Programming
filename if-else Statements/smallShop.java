import java.util.Scanner;

public class smallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine(), town = scanner.nextLine();
        float count = Float.parseFloat(scanner.nextLine());

        double price;
        switch (product)
        {
            case "coffee":
            {
                switch (town)
                {
                    case "Sofia":
                    {
                        price = 0.5;
                        System.out.printf("%.2f", price * count);
                        break;
                    }

                    case "Plovdiv":
                    {
                        price = 0.4;
                        System.out.printf("%.2f", price * count);
                        break;
                    }

                    case "Varna":
                    {
                        price = 0.45;
                        System.out.printf("%.2f", price * count);
                        break;
                    }
                }

                break;
            }

            case "water":
            {
                switch (town)
                {
                    case "Sofia": 
                    {
                        price = 0.8;
                        System.out.printf("%.2f", price * count);
                        break;
                    }

                    case "Plovdiv":
                    {
                        price = 0.7;
                        System.out.printf("%.2f", price * count);
                        break;
                    }

                    case "Varna":
                    {
                        price = 0.7;
                        System.out.printf("%.2f", price * count);
                        break;
                    }
                }

                break;
            }

            case "beer":
            {
                switch (town)
                {
                    case "Sofia":
                    {
                        price = 1.2;
                        System.out.printf("%.2f", price * count);
                        break;
                    }

                    case "Plovdiv":
                    {
                        price = 1.15;
                        System.out.printf("%.2f", price * count);
                        break;
                    }

                    case "Varna":
                    {
                        price = 1.1;
                        System.out.printf("%.2f", price * count);
                        break;
                    }
                }

                break;
            }

            case "sweets":
            {
                switch (town)
                {
                    case "Sofia":
                    {
                        price = 1.45;
                        System.out.printf("%.2f", price * count);
                        break;
                    }

                    case "Plovdiv": 
                    {
                        price = 1.3;
                        System.out.printf("%.2f", price * count);
                        break;
                    }

                    case "Varna":
                    {
                        price = 1.35;
                        System.out.printf("%.2f", price * count);
                        break;
                    }
                }

                break;
            }

            case "peanuts":
            {
                switch (town)
                {
                    case "Sofia":
                    {
                        price = 1.6;
                        System.out.printf("%.2f", price * count);
                        break;
                    }

                    case "Plovdiv":
                    {
                        price = 1.5;
                        System.out.printf("%.2f", price * count);
                        break;
                    }

                    case "Varna":
                    {
                        price = 1.55;
                        System.out.printf("%.2f", price * count);
                        break;
                    }
                }

                break;
            }
        }

        scanner.close();
    }
}
//✅
