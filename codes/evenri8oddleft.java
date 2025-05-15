package codes;

import java.util.Arrays;

public class evenri8oddleft {

    public static void main(String[] args) {
        // int[] arr = {2,3, 8, 5, 12, 7, 4, 9, 6};
        int[] arr = {1,2,3,4,5,6};
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Move left pointer until an odd number is found
            if (arr[left] % 2 == 0) {
                left++;
            }

            // Move right pointer until an even number is found
            if (arr[right] % 2 != 0) {
                right--;
            }

            // Swap odd (left) with even (right)
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }

        }System.out.println(Arrays.toString(arr));

    }
}