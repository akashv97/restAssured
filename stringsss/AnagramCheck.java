package stringsss;
//     public static boolean areAnagrams(String str1, String str2) {
//         if (str1.length() != str2.length()) return false;

//         char[] arr1 = str1.toCharArray();
//         char[] arr2 = str2.toCharArray();
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);

//         return Arrays.equals(arr1, arr2);
//     }

//     public static void main(String[] args) {
//         String str1 = "listen";
//         String str2 = "silent";

//         System.out.println("Are they anagrams? " + areAnagrams(str1, str2));
//     }
    
// }

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean isAnagram = checkAnagram(str1, str2);
        System.out.println("Are anagrams? " + isAnagram);
    }

    public static boolean checkAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false; // Length check

        int[] count = new int[26]; // Array to store frequency of characters

        // Increment for str1, Decrement for str2
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }

        // Check if all values in count[] are zero
        for (int num : count) {
            if (num != 0) return false;
        }

        return true;
    }
}
