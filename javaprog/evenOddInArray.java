package javaprog;

public class evenOddInArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        for(int i=1;i<=arr.length;i++){
            if(i%2==0){
                System.out.println("Even numbers are"+" "+ i);
            }
            else{
                System.out.println("Odd numbers are"+" "+ i);
            }
        }
    }
    
}
