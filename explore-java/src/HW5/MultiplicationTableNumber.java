package HW5;

import java.util.Scanner;

public class MultiplicationTableNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int num = sc.nextInt();

        multiplicationTable(5);
    }

    public static void multiplicationTable(int num) {
        for (int i = 1; i <= 10; i++) {
            String str = num + " * " + i + " = " + (num * i);
            System.out.println(str);
        }
    }
}
