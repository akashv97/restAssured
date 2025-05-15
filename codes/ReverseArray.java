package codes;

import java.util.Arrays;

public class ReverseArray {
     public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int left = 0, right = arr.length - 1;

        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
    
}
