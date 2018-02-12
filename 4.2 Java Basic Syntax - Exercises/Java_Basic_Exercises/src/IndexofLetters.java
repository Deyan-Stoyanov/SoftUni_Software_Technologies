import java.util.Scanner;

public class IndexofLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        char[] letters = word.toCharArray();
        for (char c:letters) {
            System.out.printf("%c -> %d", c, c - 97);
            System.out.println();
        }
    }
}
