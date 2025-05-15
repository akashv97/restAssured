package javaprog;

public class minNmaxinArr {
    public static void main(String[] args) {
        int[] arr={5,4,1,6,2,0};
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];

            }
        }
        System.out.println(min+ " " + max);

    }
}
