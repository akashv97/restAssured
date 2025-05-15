package codes;

public class rotatearraybyk {
    public static void rotateRight(int[] arr, int places) {
        int n = arr.length;
        places = places % n;  // Handle cases where places > array length

        // Rotate manually without built-in methods
        for (int i = 0; i < places; i++) {
            int last = arr[n - 1];  // Store the last element
            // Shift all elements to the right
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;  // Place the last element at the start
        }

        // Print the rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        //int[] array = {-1,-100,3,99};
        int[] array={1,7,19,24,25,32,42};
        rotateRight(array, 3);
    }   
    
}
