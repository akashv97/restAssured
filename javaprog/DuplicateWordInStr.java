package javaprog;

import java.util.*;

public class DuplicateWordInStr {
    public static void main(String[] args) {
        String str = "How are You, You are HoW, WhO Are You";
        str=str.toLowerCase().replaceAll("[^a-z\\s]", "");
        System.out.println(str);
        String[] st=str.split("\\s+");
        System.out.println(st[6]);
        Map<String,Integer> cwp= new LinkedHashMap<>();
        System.out.println(cwp);
        for(String st1:st){
            cwp.put(st1, cwp.getOrDefault(st1, 0)+1);
            System.out.println(cwp);
        }
        
        for(Map.Entry<String, Integer> en:cwp.entrySet()){
            if(en.getValue()>1){
                System.out.println(en.getKey()+ "=> " + en.getValue()+ " times");

            }
        }

    }
}
