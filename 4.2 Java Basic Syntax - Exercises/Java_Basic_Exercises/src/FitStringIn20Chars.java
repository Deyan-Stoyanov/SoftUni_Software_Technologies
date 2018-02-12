import java.util.Scanner;

public class FitStringIn20Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] arr = scanner.nextLine().toCharArray();
        char[] newArr = new char[20];
        if(arr.length < 20){
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            for (int i = arr.length; i < 20; i++) {
                newArr[i] = '*';
            }
            for (char c:newArr) {
                System.out.print(c);
            }
        }else{
            for (int i = 0; i < 20; i++) {
                System.out.print(arr[i]);
            }
        }
    }
}
