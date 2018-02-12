import java.util.Scanner;

public class ReverseChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] ch = new char[3];
        for (int i = 0; i < 3; i++) {
            ch[i] = scanner.nextLine().charAt(0);
        }
        for (int i =2; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }
}
