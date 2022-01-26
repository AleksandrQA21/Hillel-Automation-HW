package HW5;

import java.util.Scanner;

public class ReturningStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();

        System.out.println(returnGreeting(name));
    }

    public static String returnGreeting(String str){
        return "Hello, " + str + " how are you doing today?";
    }
}
