package HW5;

import java.util.Scanner;

public class RemoveFirstandLastCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your word");
        String word = sc.nextLine();

        System.out.println(removeFirdtAndLastCharacter(word));
    }

    public static String removeFirdtAndLastCharacter(String word){
        return word.substring(1,word.length()-1);
    }
}
