package javaprog;

public class countsum {

    public static void main(String[] args) {
        int n = 12345;
        int sum = 0;
        int r=0;
        while (n > 0) {
            r = n % 10;
            sum=r+sum;
            n=n/10;
        }
        System.out.println(sum);

    }

}
