package javaprog;

public class searchEleInArray {
    public static void main(String[] args) {
        int[] arr={5,4,1,6,6,2,0};
        int ele=6;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                System.out.print(i+" ");
            }
        }
    }
}
