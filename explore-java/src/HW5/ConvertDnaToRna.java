package HW5;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertDnaToRna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your DNA: ");
        String dna = sc.nextLine().toUpperCase();

        System.out.println(convert(dna));
        convertDNAtoRNA(dna);
        System.out.println(convertDNAtoRNA(dna));

    }

    //  1-й срособ
    public static String convert(String str){
        return str.toUpperCase().replace('T', 'U');
    }

    // 2-й способ
    public static String convertDNAtoRNA(String data){
        char [] ch = data.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            char result = 'U';
            if(ch[i] == 'T'){
                ch[i]= result;
//                System.out.print(ch[i]);
            }
//                System.out.print(ch[i]);
        }return Arrays.toString(ch);
    }
}
