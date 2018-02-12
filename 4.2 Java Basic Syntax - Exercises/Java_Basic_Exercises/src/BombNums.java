import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BombNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayList<Integer> nums2 = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            nums2.add(nums[i]);
        }
        int[] bombs = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int bomb = bombs[0];
        int blast = bombs[1];
        int size = nums2.size();
        for (int i = 0; i < size; i++) {
            if(nums2.get(i) == bomb){
                for (int j = Math.max(i - blast, 0); j <= Math.min(i + blast, size - 1) ; j++) {
                    nums2.set(j, 0);
                    size = nums2.size();
                }
            }
        }
        int sum = 0;
        for (int n:nums2) {
            sum += n;
        }
        System.out.println(sum);
    }
}
