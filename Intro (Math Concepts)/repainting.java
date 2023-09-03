import java.util.Scanner;

public class repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cover = scanner.nextInt(), paint = scanner.nextInt(), combInLiters = scanner.nextInt(), hours = scanner.nextInt();
        double priceCover = 1.5, pricePaint = 14.5, priceCombPerLit = 5.0;
        
        double pD = paint;
        pD += pD * 0.1;
        cover += 2;
        double costCover = cover * priceCover, costPaint = pD * pricePaint, costComb = combInLiters * priceCombPerLit;

        double costs = costCover + costPaint + costComb + 0.4;
        //System.out.println(costs);
        
        double workersCosts = (costs * 0.3) * hours;
        double all = costs + workersCosts;

        System.out.println(all);
    }
}
//✅