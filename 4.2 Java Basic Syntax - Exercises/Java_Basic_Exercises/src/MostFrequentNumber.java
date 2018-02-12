import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split("\\s+");
        int[] intArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }
        LinkedHashSet<Integer> singleNums = new LinkedHashSet<Integer>();
        for (int i = 0; i < intArr.length; i++) {
            singleNums.add(intArr[i]);
        }
        int count = 0;
        int bestCount = 0;
        int bestString = 0;
        for (Object obj: singleNums) {
            count = 0;
            for (int j = 0; j < intArr.length; j++) {
                if(intArr[j] == Integer.parseInt(obj.toString())){
                    count++;
                }
            }
            if(count > bestCount){
                bestCount = count;
                bestString = Integer.parseInt(obj.toString());
            }
        }
        System.out.println(bestString);
    }
}
