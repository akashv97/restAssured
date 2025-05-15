package stringsss;

import java.util.HashMap;
import java.util.Map;

public class countChar {
     public static void main(String[] args) {
        // String str="aaBBCCssaasb";
        String str="aabbcc";
        Map<Character,Integer> cwp=new HashMap<>();
        str=str.toLowerCase();
        for(char ch:str.toCharArray()){
            cwp.put(ch,cwp.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> en:cwp.entrySet()){
            System.out.println(en.getKey()+ "=>" + en.getValue());
        }
        System.out.println(cwp);
    }
    
}
