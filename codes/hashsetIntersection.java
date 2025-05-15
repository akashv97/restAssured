package codes;

import java.util.HashSet;

public class hashsetIntersection {
    public static void main (String[] args){
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            if (set1.contains(num)) {
                // intersection.add(num);
                intersection.addAll(set1);
            }
        }

        System.out.println("Common elements: " + intersection);

    }
    

    
}
