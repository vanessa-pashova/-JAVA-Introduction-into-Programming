import java.util.Scanner;

public class basketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tax = scanner.nextInt();
       
        double shoes = (double)tax - ((double)tax * 0.4),
        equipment = shoes - (shoes * 0.2),
        ball = equipment * 0.25,
        assecS = ball * 0.2,
        sum = tax + shoes + equipment + ball + assecS;

        System.out.println(sum);
    }
}
//✅