package codes;

import java.util.ArrayList;
import java.util.Arrays;

public class removeelement {
    public static void main(String[] args) {
        int[] nums={3,2,2,3};
        int val=2;
        ArrayList <Integer> list= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                list.add(nums[i]);
            }

        }
        System.out.println(list.size());
        int [] re=list.stream().mapToInt(i->i).toArray();
        System.out.println(Arrays.toString(re));
        
    }
    
}
