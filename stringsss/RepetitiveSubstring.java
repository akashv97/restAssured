package stringsss;

public class RepetitiveSubstring {

//     public static void main(String[] args) {
//         String str = "ababab";

//         for (int i = 1; i <= str.length() / 2; i++) {
//             String subStr = str.substring(0, i);
//             if (str.length() % i == 0) {
//                 String repeated = subStr.repeat(str.length() / i);
//                 if (repeated.equals(str)) {
//                     System.out.println("Repetitive Substring: " + subStr);
//                     return;
//                 }
//             }
//         }
//         System.out.println("No repetitive substring found.");
//     }

    public static String findRepeatingSubstring(String s) {
        int n = s.length();
        int[] lps = new int[n]; // Longest Prefix Suffix array
        int j = 0; // Pointer for repeated pattern

        for (int i = 1; i < n; i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = lps[j - 1];
            }
            if (s.charAt(i) == s.charAt(j)) {
                lps[i] = ++j;
            }
        }

        int patternLength = n - lps[n - 1]; // Length of repeating pattern
        if (lps[n - 1] > 0 && n % patternLength == 0) {
            return s.substring(0, patternLength);
        }
        return "No repetitive substring found.";
    }

    public static void main(String[] args) {
        String str = "xxyzxyzxyz";
        System.out.println("Repetitive Substring: " + findRepeatingSubstring(str));
    }
    
    
}
