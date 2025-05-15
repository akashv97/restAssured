package javaprog;

import java.util.Arrays;

public class splitbySpace {
    public static void main(String[] args) {
        String str = "Java is fun";
        
        // Split by space
        String[] parts = str.split(" ");
        String par = str.split(" ")[2];
        System.out.println(Arrays.toString(parts));
        System.out.println(par);
        
        // Print the array
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
