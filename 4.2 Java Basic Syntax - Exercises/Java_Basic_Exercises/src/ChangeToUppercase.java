import java.util.Scanner;

public class ChangeToUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        while(text.indexOf("<upcase>") != -1 && text.indexOf("</upcase>") != -1){
            String strToRemove = text.substring(text.indexOf("<upcase>"), text.indexOf("</upcase>") + 9);
            String strToReplace = text.substring(text.indexOf("<upcase>") + 8, text.indexOf("</upcase>"));
            String replacement = strToReplace.toUpperCase();
            text = text.replace(strToRemove, replacement);
        }
        System.out.println(text);
    }
}
