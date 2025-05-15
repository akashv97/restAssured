package javaprog;

public class palindromeString {
    public static void main(String[] args) {
        String str="madam";
        int left=0;
        int ri8=str.length()-1;
        while(left<ri8){
            if(str.charAt(left)!=str.charAt(ri8)){
                System.out.println("Not Palindrome");
            }
            left++;
            ri8--;
        }
        System.out.println("Palindrome");
        
    }
}
