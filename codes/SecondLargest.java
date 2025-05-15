package codes;

public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) throw new IllegalArgumentException("Array must have at least two elements");

        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        // int[] arr = {12, 35, 1, 10, 34, 1};
        int[] arr = {1,2,3,4};
        System.out.println("Second Largest: " + findSecondLargest(arr));
    }
}
