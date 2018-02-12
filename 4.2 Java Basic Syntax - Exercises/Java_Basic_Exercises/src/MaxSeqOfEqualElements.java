import java.util.Scanner;

public class MaxSeqOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split("\\s+");

        int currStart = 0;
        int currLen = 1;
        int bestStart = 0;
        int bestLen = 1;
        for (int i = 1; i < arr.length; i++) {
            if(Integer.parseInt(arr[i]) == Integer.parseInt(arr[i - 1])){
                currLen++;
                if(currLen > bestLen){
                    bestStart = currStart;
                    bestLen = currLen;
                }
            }else{
                currLen = 1;
                currStart = i;
            }

        }
        for (int i = bestStart; i < bestStart + bestLen; i++) {
            if(i >= arr.length){
                break;
            }
            System.out.print(arr[i] + " ");
        }
    }
}
