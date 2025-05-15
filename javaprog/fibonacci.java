package javaprog;

public class fibonacci {
    public static void main(String[] args) {
        int n=10;
        int f=0;
        int s=1;
        for(int i=2;i<n;i++){
            int next=f+s;
            System.out.print(next+ " ");
            f=s;
            s=next;

        }

    }
}
