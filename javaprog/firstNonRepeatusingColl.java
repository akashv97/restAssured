package javaprog;

import java.util.LinkedHashMap;
import java.util.Map;

public class firstNonRepeatusingColl {
    public static void main(String[] args) {
        String str="Swiss";
        str=str.toLowerCase();
        Character result=firstNonRepeatingChar(str);

        if(result!=null){
            System.out.println(result);
        }
        else{
            System.out.println("Not Found");
        }
        
    }
    public static Character firstNonRepeatingChar(String str){
        // by using linkedmap

        Map<Character,Integer> counterMap= new LinkedHashMap<>();
        for(char ch:str.toCharArray()){
            counterMap.put(ch, counterMap.getOrDefault(ch, 0)+1);
        }
        for (Map.Entry<Character, Integer> en : counterMap.entrySet()) {
            if(en.getValue()==1){
                return en.getKey();
            }
            
        }
        return null;

    }
    
}
