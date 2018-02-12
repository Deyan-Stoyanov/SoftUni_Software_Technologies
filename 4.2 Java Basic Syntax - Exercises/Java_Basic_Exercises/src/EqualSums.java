import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int specialNum = 0;
        int sum1 = 0;
        int sum2 = 0;
        boolean noNum = true;
        for (int i = 0; i < nums.length - 2; i++) {
            sum1 += nums[i];
            for (int j = nums.length - 1; j > i + 1; j--) {
                sum2 += nums[j];
                if(sum1 == sum2){
                    noNum = false;
                    System.out.println(j - 1);
                }
            }
            sum2 = 0;
        }
        if(nums.length == 1){
            System.out.println(0);
        }
        else if(noNum){
            System.out.println("no");
        }
    }
}
