package HW4;

import java.util.Scanner;

public class ConverterInchesToMeters {
    public static void main(String[] args) {
        System.out.println("Enter number of inches ");
        Scanner sc = new Scanner(System.in);
        double inches = sc.nextDouble();

        convertInchesToMeters(inches);
    }

    static void convertInchesToMeters(double inches){
        double result = inches * 0.0254;
        System.out.println(inches + " inches" + " = " + result + " meters");
        System.out.println("=====================================");
        System.out.println("Developer: Titovskyi Oleksandr");
        System.out.println("Task has been given on 30th Dec 2021");
        System.out.println("Task has been done on 4th Jan 2022 ");
    }
}
