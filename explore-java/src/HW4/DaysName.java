package HW4;

import java.util.Scanner;

public class DaysName {
    public static void main(String[] args) {
        System.out.println("Please input number day of week from 1 to 7: ");
        Scanner sc = new Scanner(System.in);
        int numberDay = sc.nextInt();

        validationDay(numberDay);
        dayNumber(numberDay);

    }

    //Validation for the correct input number
    static String validationDay (int numDay){
        String validationDay = (numDay < 1 || numDay > 7) ? "Incorrect number" : "correct number";
        System.out.println(validationDay);
        return validationDay;
    }


    static void dayNumber (int numberDay){
        switch (numberDay) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Incorrect day number");
        }
    }
}
