package HW5;

import java.sql.Array;
import java.util.Scanner;

public class ConvertStringToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your sentence: ");
        String str = sc.nextLine();

        String [] arr = arr(str);
        for (String s: arr) {
            System.out.print(s);
            System.out.print(" ");
        }
    }

    public static String [] arr (String text){
        return text.split(" ");

    }
}
