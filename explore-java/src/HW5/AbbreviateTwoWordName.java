package HW5;

import java.util.Scanner;

public class AbbreviateTwoWordName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Full Name: ");
        String name = sc.nextLine();

        System.out.println(returnAbbreviate(name));
    }

    public static String returnAbbreviate(String str) {
        String result = str.toUpperCase();
        String[] arr = result.split(" ");
        return arr[0].charAt(0) + "." + arr[1].charAt(0);
    }
}
