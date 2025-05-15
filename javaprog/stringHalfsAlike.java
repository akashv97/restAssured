package javaprog;

import java.util.Set;

public class stringHalfsAlike {
    public static void main(String[] args) {
        String str="book";
        int n=str.length();
        Set<Character> set=Set.of('a','e','i','o','u');
        int c=0;
        for(int i=0;i<n/2;i++){
            if(set.contains(str.charAt(i))){
                c+=1;
            }
        }
        for(int i=n/2;i<n;i++){
            if(set.contains(str.charAt(i))){
                c-=1;
            }
        }
        if(c==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    
}
