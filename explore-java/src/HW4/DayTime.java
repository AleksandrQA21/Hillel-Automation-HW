package HW4;

import java.util.Scanner;

public class DayTime {
    public static void main(String[] args) {
        System.out.println("Введите текущее время: ");
        Scanner sc = new Scanner(System.in);
        double time = sc.nextDouble();

        printDayTime(time);
        System.out.println(printDayTomeTernaryOperator(time));

    }

    static void printDayTime(double time) {
        if (time > 18) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Good Day");
        }
    }

    static String printDayTomeTernaryOperator(double time) {
        String result = time > 18 ? "Good Evening" : "Good Day";
        return result;
    }
}
