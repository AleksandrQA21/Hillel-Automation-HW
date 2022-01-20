package HW4;

import java.util.Scanner;

public class ConvertMinutesInYearsDays {
    public static void main(String[] args) {
        System.out.println("Enter number of minutes: ");
        Scanner sc = new Scanner(System.in);
        int minutes = sc.nextInt();

        convertMinutesToYearsDays(minutes);
    }

    static void convertMinutesToYearsDays (int minutes){
        int year = minutes / 525600;
        int remainMinutes = minutes % 525600;
        int day = remainMinutes / 1440;

        System.out.println(minutes + " minutes equel to " + year + " years " + day + " days");
    }
}
