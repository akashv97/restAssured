package stringsss;

public class commanCharinstrings {

    public static String findCommonChars(String str1, String str2) {
        StringBuilder common = new StringBuilder();

        // Convert second string to char array for removal
        StringBuilder str2Copy = new StringBuilder(str2);

        for (char ch : str1.toCharArray()) {
            int index = str2Copy.indexOf(String.valueOf(ch));
            if (index != -1) {
                common.append(ch);
                //str2Copy.deleteCharAt(index); // Remove used character to handle duplicates
            }
        }

        return common.toString();
    }

    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "lemon";

        String result = findCommonChars(s1, s2);
        System.out.println("Common characters: " + result); // Output: "le"
    }



    
}
