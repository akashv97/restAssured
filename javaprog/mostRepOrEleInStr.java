package javaprog;

import java.util.LinkedHashMap;
import java.util.Map;

public class mostRepOrEleInStr {
    public static void main(String[] args) {
        String str="aabbcchhdjErQQeeer";
        str=str.toLowerCase();
        Map<Character,Integer> cmap= new LinkedHashMap<>();
        for(char ch:str.toCharArray()){
            cmap.put(ch, cmap.getOrDefault(ch, 0)+1);
        }
        char mfc=0;
        int mxc=0;
        for(Map.Entry<Character,Integer> en:cmap.entrySet()){
            if(en.getValue()>mxc){
                mfc=en.getKey();
                mxc=en.getValue();
            }
        }
        System.out.println(mfc);
        System.out.println(mxc);
    }
}
