package javaprog;

public class reversenum {
    public static void main(String[] args) {
        // while loop
        int n=1234;
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;
        }
        System.out.println(rev);

        // using StringBuffer

        // StringBuffer sb=new StringBuffer(String.valueOf(n));
        // StringBuffer rev=sb.reverse();
        // System.out.println(rev);

        // using StringBuilder

        // StringBuilder sb=new StringBuilder();
        // sb.append(n);
        // StringBuilder rev=sb.reverse();
        // System.out.println(rev);
    }
    
}
