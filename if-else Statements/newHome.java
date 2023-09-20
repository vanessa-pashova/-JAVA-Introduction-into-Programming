import java.util.Scanner;

public class newHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        short count = Short.parseShort(scanner.nextLine()), budget = Short.parseShort(scanner.nextLine());

        double rosePrice = 5, dahliasPrice = 3.8, tulipsPrice = 2.8, narcissusPrice = 3, gladiolusPrice = 2.5,
        all = 0, discount = 0, endPrice = 0;

        switch (flower)
        {
            case "Roses":
            {
                all = count * rosePrice;
                if (count > 80)
                {
                    discount = all * 0.1;
                    endPrice = all - discount;
                }

                else endPrice = all;
                break;
            }

            case "Dahlias":
            {
                all = count * dahliasPrice;
                if (count > 90)
                {
                    discount = all * 0.15;
                    endPrice = all - discount;
                }

                else endPrice = all;
                break;
            }

            case "Tulips":
            {
                all = count * tulipsPrice;
                if (count > 80)
                {
                    discount = all * 0.15;
                    endPrice = all - discount;
                }

                else endPrice = all;
                break;
            }

            case "Narcissus":
            {
                all = count * narcissusPrice;
                if (count < 120)
                {
                    discount = all * 0.15;
                    endPrice = all + discount;
                }

                else endPrice = all;
                break;
            }

            case "Gladiolus":
            {
                all = count * gladiolusPrice;
                if (count < 80)
                {
                    discount = all * 0.2;
                    endPrice = all + discount;
                }

                else endPrice = all;
                break;
            }
        }

        if (endPrice <= budget)
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flower, (budget - endPrice));

        else System.out.printf("Not enough money, you need %.2f leva more.", (endPrice - budget));
        scanner.close();
    }
}
// ✅