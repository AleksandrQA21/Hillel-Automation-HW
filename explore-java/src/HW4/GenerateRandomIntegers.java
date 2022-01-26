package HW4;

import java.util.Scanner;

public class GenerateRandomIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter start number: "));
        int start_number = sc.nextInt();
        System.out.println("Enter last number: ");
        int last_number = sc.nextInt();

        generateRandomIntegers(start_number,last_number);

    }

    static void generateRandomIntegers(int start, int last){
        int random_number = start + (int)(Math.random() * last) ;
        System.out.println(random_number);
    }
}
