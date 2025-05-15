package javaprog;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeduplicatesfromsortedarray {
    public static void main(String[] args) {
        // Sorted Array

        // int[] arr={1,2,2,3,4,4};
        // Set<Integer> set1= new HashSet<>();
        // for(int num:arr){
        //     set1.add(num);
        // }
        // System.out.print(set1);

        // unsorted Array
        
        // int[] arr={28,90,78,90,45,78};
        // Set<Integer> set1=new LinkedHashSet<>();
        // for(int num:arr){
        //     set1.add(num);
        // }
        // System.out.println(set1);

        // without using set

        // int[] arr={1,2,2,3,4,4};
        // if(arr.length==0){
        //     System.out.println("Array is Empty");
        // }
        // int j=0;
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i]!=arr[j]){
        //         j++;
        //         arr[j]=arr[i];
        //     }
        // }
        // for(int i=0;i<=j;i++){
        //     System.out.print(arr[i]+ " ");
            
        // }

        // unsorted array (preserve order,remove duplicates)

        int [] arr={4,9,5,6,9,4};
        if(arr.length==0){
            System.out.print("Array is Empty");
        }
        Set<Integer> set1=new LinkedHashSet<>();
        for(int num:arr){
            set1.add(num);
        }
        System.out.println(set1);
        System.out.println(set1.size());
        int[] r=new int [set1.size()];
        System.out.println(Arrays.toString(r));
        int i=0;
        for(int num:set1){
            r[i++]=num;
        }
        System.out.println(Arrays.toString(r));

        

    }
}
