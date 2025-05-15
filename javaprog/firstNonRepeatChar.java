package javaprog;

public class firstNonRepeatChar {
    public static void main(String[] args) {
        String str="swiss";
        // str=str.toLowerCase();
        Character result=firstNonRepeatingChar(str);

        if(result!=null){
            System.out.println(result);
        }
        else{
            System.out.println("Not Found");
        }
        
    }
    public static Character firstNonRepeatingChar(String str){
        // by using loop
        
        for(int i=0;i<str.length();i++){
            boolean Isunique=true;
            for(int j=0;j<str.length();j++){
                    if(i!=j && str.charAt(i)==str.charAt(j)){
                        Isunique=false;
                        break;
                    }
            }
            if(Isunique){
                return str.charAt(i);
            }
        }
        return '\0';

        

    }
}
