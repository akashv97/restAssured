package stringsss;

import java.util.HashMap;
import java.util.Map;

public class dubpilcateword {

    public static void main(String[] args) {
        String str = "How are You, You are HoW, WhO Are You";
        str = str.toLowerCase().replaceAll("[^a-z\\s]","");
        System.out.println(str);
        String [] st=str.split("\\s+");
        System.out.println(st[1]);
        Map<String,Integer> wordcount=new HashMap<>();
        for(String stw:st){
           // System.out.println(stw);
            wordcount.put(stw, wordcount.getOrDefault(stw, 0)+1);
            System.out.println(wordcount);
        }
        for(Map.Entry<String,Integer> entry:wordcount.entrySet()){
            if(entry.getValue()>1){
                System.err.println(entry.getKey() + "=>" + entry.getValue() + " times");
            }
        }
       

    }

}
