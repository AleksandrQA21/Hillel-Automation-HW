package HW4;

import java.util.Scanner;

public class UserSpeed {
    public static void main(String[] args) {
        System.out.println("Input distance in meters: ");
        Scanner sc = new Scanner(System.in);
        double distance = sc.nextDouble();
        System.out.println("Input hour: ");
        double hour = sc.nextInt();
        System.out.println("Input minutes: ");
        double minutes = sc.nextInt();
        System.out.println("Input seconds: ");
        double seconds = sc.nextInt();

        printConvertSpeed(distance,hour,minutes,seconds);

    }

    static void printConvertSpeed(double distance, double hour, double minutes, double seconds){

        double timeSecond = hour * 3600 + minutes * 60 + seconds;
        double timeHour = hour + (minutes / 60) + (seconds / 3600);
        double speedInMeters = distance / timeSecond;
        double speedInKilometers = (distance / 1000) / timeHour;
        System.out.println("Your speed in meters/second is " + speedInMeters);
        System.out.println("===============================================");
        System.out.println("Your speed in km/h is " + speedInKilometers);
    }
}
