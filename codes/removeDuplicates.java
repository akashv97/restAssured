package codes;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 2, 1, 4, 5};
        int c=0;
        Set<Integer> st1 = new HashSet<>();
        for (int nums : arr) {
            st1.add(nums);
            
        }
        for (int nums : st1) {
            st1.add(nums);
            
        }
        //System.out.println(c);
        System.out.println(st1);

    }

}
