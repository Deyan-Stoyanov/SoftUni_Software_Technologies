import java.util.Scanner;

public class CensorEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        String text = scanner.nextLine();
        char[] arr = email.toCharArray();
        for (int i = 0; i < email.indexOf('@'); i++) {
            arr[i] = '*';
        }
        String replacement = "";
        for (char c:arr) {
            replacement += c;
        }
        text = text.replaceAll(email, replacement);
        System.out.println(text);
    }
}
