package HW4;

import java.util.Scanner;

public class LengthString {
    public static void main(String[] args) {
            System.out.println("Input word Java: ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();

            wordLength(str);
        }

        static void wordLength (String str){
            int b = str.length();
            if (b > 10){
                System.out.println("Error");
            } else {
                System.out.println(b);
            }
    }
}
