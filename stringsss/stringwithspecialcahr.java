package stringsss;
public class stringwithspecialcahr {
    public static void main(String[] args) {
        String str = "Hello@World!123#Java$%";

        System.out.print("Special Characters: ");
        for (char ch : str.toCharArray()) {  // Convert string to character array
            if (!Character.isLetterOrDigit(ch)) {  // Check if NOT a letter or digit
                System.out.print(ch + " ");
            }
        }
    }
}
