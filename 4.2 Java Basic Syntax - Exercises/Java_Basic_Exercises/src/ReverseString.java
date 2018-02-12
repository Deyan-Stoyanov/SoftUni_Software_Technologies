import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] arr = scanner.nextLine().toCharArray();
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j]);
        }
    }
}
