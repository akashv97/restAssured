package javaprog;

public class palindromenum {
    public static void main(String[] args) {
        int num=16461;
        int org_num=num;
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        if(org_num==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        
        
    }
}
