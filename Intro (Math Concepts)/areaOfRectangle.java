import java.util.Scanner;

public class areaOfRectangle {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("[ insert a value for a ] -> ");
        int a = Integer.parseInt(input.nextLine());
        System.out.print("[ insert a value for b ] -> ");
        int b = Integer.parseInt(input.nextLine());

        int area = a * b;
        System.out.println("[ area of the rectangle ] -> " + area);
    } 
}
//✅