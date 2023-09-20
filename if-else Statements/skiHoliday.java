import java.util.Scanner;

public class skiHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stayDays = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine(), rate = scanner.nextLine();

        double costPerNight = 0, discount = 0, all = 0;
        switch (typeRoom)
        {
            case "room for one person":
            {
                costPerNight = 18.00;
                all = costPerNight * (stayDays - 1);
                break;
            }

            case "apartment":
            {
                costPerNight = 25.00;
                all = costPerNight * (stayDays - 1);

                if (0 < stayDays && stayDays < 10)
                {
                    discount = all * 0.3;
                    all -= discount;
                }

                else if (10 <= stayDays && stayDays <= 15)
                {
                    discount = all * 0.35;
                    all -= discount;
                }

                else if (15 < stayDays)
                {
                    discount = all * 0.5;
                    all -= discount;
                }

                break;
            }

            case "president apartment":
            {
                costPerNight = 35.00;
                all = costPerNight * (stayDays - 1);

                if (0 < stayDays && stayDays < 10)
                {
                    discount = all * 0.1;
                    all -= discount;
                }

                else if (10 <= stayDays && stayDays <= 15)
                {
                    discount = all * 0.15;
                    all -= discount;
                }

                else if (15 < stayDays)
                {
                    discount = all * 0.2;
                    all -= discount;
                }
                
                break;
            }
        }

        switch (rate)
        {
            case "positive":
            {
                discount = all * 0.25;
                all += discount;
                break;
            }

            case "negative":
            {
                discount = all * 0.1;
                all -= discount;
                break;
            }
        }

        System.out.printf("%.2f", all);
        scanner.close();
    }
}
// ✅