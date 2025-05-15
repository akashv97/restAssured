package codes;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 45, 78, 34, 89, 23};
        // int[] arr = {1,8,7,56,90};
        int largest = arr[0];

        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }

        System.out.println("Largest element: " + largest);
    }
}
