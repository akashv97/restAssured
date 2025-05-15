package codes;

import java.util.ArrayList;
import java.util.Arrays;

public class arrayListToArray {
     public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40));

        // Convert to Integer[]
        Integer[] integerArray = list.toArray(new Integer[0]);

        // Create int[] array
        int[] arr = new int[integerArray.length];

        // Copy elements manually
        for (int i = 0; i < integerArray.length; i++) {
            arr[i] = integerArray[i];
        }

        System.out.println("Array: " + Arrays.toString(arr));
    }
}
