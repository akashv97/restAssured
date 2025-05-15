package javaprog;

import java.util.HashSet;
import java.util.Set;

public class findmissingnum {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,7};
        int n=7;
        Set<Integer> set=new HashSet<>();
        for(int arr1:arr){
            set.add(arr1);
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                System.out.print(i+" ");
            }

        }
        
    }
}
