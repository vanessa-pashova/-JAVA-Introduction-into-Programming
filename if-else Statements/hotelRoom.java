import java.util.Scanner;

public class hotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        short stays = Short.parseShort(scanner.nextLine());
        String opt1 = "Apartment", opt2 = "Studio";
        double discount1 = 0, discount2 = 0, cost1 = 0, cost2 = 0;

        switch (month)
        {
            case "May":
            {
                cost1 = stays * 65; cost2 = stays * 50;

                //TODO: studio 5% discount
                if (7 < stays && stays <= 14)  
                {
                    discount2 = cost2 * 0.05;
                    cost2 -= discount2;
                }

                else if (stays > 14)
                {
                    //TODO: apartment 10% discount
                    discount1 = cost1 * 0.1;
                    cost1 -= discount1;

                    //TODO: studio 30% discount
                    discount2 = cost2 * 0.3;
                    cost2 -= discount2;
                }
                
                break;
            }

            case "October":
            {
                cost1 = stays * 65; cost2 = stays * 50;
                
                //TODO: studio 5% discount
                if (7 < stays && stays <= 14)  
                {
                    discount2 = cost2 * 0.05;
                    cost2 -= discount2;
                }

                else if (stays > 14)
                {
                    //TODO: apartment 10% discount
                    discount1 = cost1 * 0.1;
                    cost1 -= discount1;
                    discount2 = cost2 * 0.3;
                    cost2 -= discount2;
                }

                break;
            }

            case "June":
            {
                cost1 = stays * 68.7; cost2 = stays * 75.2;

                if (stays > 14)
                {
                    //TODO: apartment 10% discount
                    discount1 = cost1 * 0.1;
                    cost1 -= discount1;

                    //TODO: studio 20% discount
                    discount2 = cost2 * 0.2;
                    cost2 -= discount2;
                }

                break;
            }

            case "September":
            {
                cost1 = stays * 68.7; cost2 = stays * 75.2;

                if (stays > 14)
                {
                    //TODO: apartment 10% discount
                    discount1 = cost1 * 0.1;
                    cost1 -= discount1;

                    //TODO: studio 20% discount
                    discount2 = cost2 * 0.2;
                    cost2 -= discount2;
                }

                break;
            }

            case "July":
            {
                cost1 = stays * 77; cost2 = stays * 76;

                if (stays > 14)
                {
                    //TODO: apartment 10% discount
                    discount1 = cost1 * 0.1;
                    cost1 -= discount1;
                }

                break;
            }

            case "August":
            {
                cost1 = stays * 77; cost2 = stays * 76;

                if (stays > 14)
                {
                    //TODO: apartment 10% discount
                    discount1 = cost1 * 0.1;
                    cost1 -= discount1;
                }

                break;
            }
        }

        System.out.printf("%s: %.2f lv.\n%s: %.2f lv.", opt1, cost1, opt2, cost2);
        scanner.close();
    }
}
// ✅