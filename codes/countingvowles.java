package codes;
public class countingvowles {
    public static int countVowels(String str) {
        str = str.toLowerCase(); // Convert to lowercase to handle both cases
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++; // Increase count if it's a vowel
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        int vowelCount = countVowels(str);
        System.out.println("Number of vowels: " + vowelCount);
    }
}
