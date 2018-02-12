import java.util.Scanner;

public class CompareCharArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr1 = scanner.nextLine().split("\\s+");
        String[] arr2 = scanner.nextLine().split("\\s+");
        String str1 = "";
        String str2 = "";
        for (int i = 0; i < arr1.length; i++) {
            str1 += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            str2 += arr2[i];
        }

        if (str1.length() > str2.length()) {
            System.out.println(str1);
            System.out.println(str2);
        }else if(str1.length() < str2.length()){
            System.out.println(str2);
            System.out.println(str1);
        }else{
            boolean areEqual = true;
            for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
                if(str1.toCharArray()[i] + 0 < str2.toCharArray()[i] + 0){
                    System.out.println(str1);
                    System.out.println(str2);
                    areEqual = false;
                    break;
                }else if(str1.toCharArray()[i] + 0 > str2.toCharArray()[i] + 0){
                    System.out.println(str2);
                    System.out.println(str1);
                    areEqual = false;
                    break;
                }
            }
            if(areEqual){
                System.out.println(str1);
                System.out.println(str2);
            }
        }
    }
}
