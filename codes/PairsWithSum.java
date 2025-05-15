package codes;

import java.util.Arrays;
import java.util.HashSet;

public class PairsWithSum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        // int[] nums = {2,4,3,5,7,8,-1};
        int target = 6;
        int c=0;
        Arrays.sort(nums);

        HashSet<Integer> set = new HashSet<>();

        System.out.println("Pairs with sum " + target + ":");
        for (int num : nums) {
            int complement = target - num;

            if (set.contains(complement)) {
                System.out.print("(" + complement + ", " + num + ")");
                c+=1;
                // System.out.println(c);
            }
            set.add(num);
        }
        System.out.println(c);
    }
}
