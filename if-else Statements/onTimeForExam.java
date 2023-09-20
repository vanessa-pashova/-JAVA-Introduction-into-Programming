import java.util.Scanner;

public class onTimeForExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());

        int examTime = examHour * 60 + examMinute;
        int arrivalTime = arrivalHour * 60 + arrivalMinute;

        int timeDifference = examTime - arrivalTime;

        if (timeDifference < 0) 
        {
            System.out.println("Late");
            if (timeDifference > -60) 
                System.out.printf("%d minutes after the start", Math.abs(timeDifference));
            
            else 
            {
                int hours = Math.abs(timeDifference) / 60;
                int minutes = Math.abs(timeDifference) % 60;
                System.out.printf("%d:%02d hours after the start", hours, minutes);
            }
        } 
        
        else if (timeDifference <= 30) 
        {
            System.out.println("On time");
            if (timeDifference != 0) 
                System.out.printf("%d minutes before the start", timeDifference);
            
        } 
        
        else 
        {
            System.out.println("Early");
            if (timeDifference < 60)
                System.out.printf("%d minutes before the start", timeDifference);
            
            else 
            {
                int hours = timeDifference / 60;
                int minutes = timeDifference % 60;
                System.out.printf("%d:%02d hours before the start", hours, minutes);
            }
        }

        scanner.close();
    }
}
//✅
