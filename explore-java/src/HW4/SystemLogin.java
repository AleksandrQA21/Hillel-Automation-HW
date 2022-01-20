package HW4;

import java.util.Scanner;

public class SystemLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your Name: ");
        String name = sc.nextLine();
        String authorithationName = "Yuriy";

        validationInputName(name,authorithationName);


        System.out.println("Input your password: ");
        Scanner scan = new Scanner(System.in);
        int loginPass = scan.nextInt();

        validationInputPassword(loginPass);

    }

    static String validationInputName(String name, String authorithationName) {
        String loginNameValidation = (name.equals(authorithationName)) ? "Name is correct" : "Incorrect name";
        System.out.println(loginNameValidation);
        return loginNameValidation;
    }

    static String validationInputPassword (int loginPass){
        // Validation for input password
        final int password = 12345;
        String passValidation = (loginPass == password) ? "Password is correct" : "Incorrect password";
        System.out.println(passValidation);
        return passValidation;
    }
}
