import java.util.Scanner;

public class VowelOrDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.nextLine().charAt(0);
        if(c == 'a' || c == 'e' || c == 'u' || c == 'i' || c == 'o'){
            System.out.println("vowel");
        }else if(c + 0 >= 48 && c + 0 <= 57){
            System.out.println("digit");
        }else {
            System.out.println("other");
        }
    }
}
