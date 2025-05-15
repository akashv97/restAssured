package javaprog;

public class swaptwonumbers {
    public static void main(String[] args) {
        // with third variable
        int a=19;
        int b=10;
        // int c=a;
        // a=b;
        // b=c;
        // System.out.println(a +" " +b);

        // without third variable
        // a=a-b;
        // b=b+a;
        // a=b-a;
        // System.out.println(a+ " " +b);

        // with * and /
        // a=a*b;
        // b=a/b;
        // a=a/b;
        // System.out.println(a+ " " +b);
        
        // with bitwise ^
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+ " " +b);

    }
    
}
