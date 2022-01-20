package HW4;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = sc.nextLine();

        System.out.println("Enter your weight (kg) = ");
        double weight = sc.nextDouble();

        System.out.println("Enter your height (meter) = ");
        double height = sc.nextDouble();

        double result = calculateBodyMassIndex(weight,height);
        System.out.println("BMI = " + result + " кg/м");
        System.out.println("==================================");
        printResult(name, weight, height, result);
    }


    static double calculateBodyMassIndex(double weight, double height){
        if (weight <= 0 || height <= 0) {
            System.out.println("Вес/рост не может быть равен нулю");
        }
        double bmi = weight / (height * height);
        return bmi;
    }

    static String interpretationBMI(double bmi) {
        String result;
        if (bmi < 16) {
            result = "Выраженный дефицит массы тела";
        } else if (bmi >= 16 && bmi < 18.5) {
            result = "Недостаточная (дефицит) масса тела";
        } else if (bmi >= 18.5 && bmi < 25) {
            result = "Норма";
        } else if (bmi >= 25 && bmi < 30) {
            result = "Избыточная масса тела (предожирение)";
        } else if (bmi >= 30 && bmi < 35) {
            result = "Ожирение 1-й степени";
        } else if (bmi >= 35 && bmi < 40) {
            result = "Ожирение 2-й степени";
        } else {
            result = "Ожирение 3-й степени";
        }
        return result;
    }

    static void printResult(String name, double weight, double height, double bmi ){
        System.out.println("Имя человека - " + name);
        System.out.println("Масса человека = " + weight + "(кг)");
        System.out.println("Рост человека = " + height + "(м)");
        System.out.println("BMI = " + bmi);
        System.out.println("результаты соответствия = " + interpretationBMI(bmi));
    }
}
