package HW5;

public class RemoveStringSpaces {
    public static void main(String[] args) {
        String str = "Remove Spaces String";
        System.out.println(removeSpaces(str));
    }

    public static String removeSpaces(String string){
        return string.replaceAll("\\s","");
    }
}
