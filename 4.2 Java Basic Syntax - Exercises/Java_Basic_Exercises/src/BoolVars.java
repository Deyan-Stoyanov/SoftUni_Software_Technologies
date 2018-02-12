import java.util.Scanner;

public class BoolVars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        boolean b = Boolean.parseBoolean(str);
        if(b == true){
            System.out.println("Yes");
        }else if(b == false){
            System.out.println("No");
        }
    }
}
