package javaprog;

public class maxdiff {

    // Method to find the maximum difference between any two elements such that the
    // larger element appears after the smaller element
    public static int maxDifference(int[] nums) {
        if (nums == null) {
            return 0;
        }
    
        int minEle = nums[0];
        int maxdif = nums[1] - nums[0];
    
        for (int i = 1; i < nums.length; i++) {
            int diff = nums[i] - minEle;
            if (diff > maxdif) {
                maxdif = diff;
            }
            if (nums[i] < minEle) {
                minEle = nums[i]; // ✅ Corrected this line
            }
        }
    
        return maxdif > 0 ? maxdif : (maxdif == 0 ? 0 : -1);
    }

    // Method to run all test cases
    public static void runTests() {
        assert testMaxDifference(new int[] { 2, 3, 10, 6, 4, 8, 1 }, 8) : "Test Case 1 Failed";
        assert testMaxDifference(new int[] { 7, 9, 5, 6, 3, 2 }, 2) : "Test Case 2 Failed";
        assert testMaxDifference(new int[] { 1, 2, 90, 10, 110 }, 109) : "Test Case 3 Failed";
        assert testMaxDifference(new int[] { 7, 1, 5, 3, 6, 4 }, 5) : "Test Case 4 Failed";
        assert testMaxDifference(new int[] { 9, 7, 4, 3 }, -1) : "Test Case 5 Failed";
        assert testMaxDifference(new int[] { 1, 1, 1, 1 }, 0) : "Test Case 6 Failed";
        assert testMaxDifference(new int[] {}, 0) : "Test Case 7 Failed";
        assert testMaxDifference(new int[] { 100, 180, 260, 310, 40, 535, 695 }, 655) : "Test Case 8 Failed";

        System.out.println("All test cases passed!");
    }

    // Helper method to validate the result of maxDifference
    private static boolean testMaxDifference(int[] input, int expected) {
        int result = maxDifference(input);
        return result == expected;
    }

    public static void main(String[] args) {
        runTests();
    }
}
