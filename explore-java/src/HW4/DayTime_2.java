package HW4;

import java.util.Scanner;

public class DayTime_2 {
    public static void main(String[] args) {
        System.out.println("Введите текущее время: ");
        Scanner sc = new Scanner(System.in);
        double time = sc.nextDouble();

        timeValidation(time);
        dayTime(time);

    }
    //Валидация корректно введенного времени
    static void timeValidation(double time){
        String timeValidation = (time >= 0 && time <= 24) ? "Correct input" : "Incorrect time";
        System.out.println(timeValidation);
    }

    static void dayTime(double time){
        if (time >= 10 && time < 18){
            System.out.println("Good Day");
        } else if (time >= 18 || time < 4 ) {
            System.out.println("Good Evening");
        } else if (time >= 4 && time < 10) {
            System.out.println("Good morning");
        }
    }
}
