package javaprog;

public class stringsplitNumDigitChar {
    public static void main(String[] args) {
        String str = "quail123@#$";
        StringBuilder s1= new StringBuilder();
        StringBuilder s2= new StringBuilder();
        StringBuilder s3= new StringBuilder();
        for(char ch:str.toCharArray()){
            if(Character.isLetter(ch)){
                s1.append(ch);
            }
            else if(Character.isDigit(ch)){
                s2.append(ch);
            }
            else{
                s3.append(ch);
            }
        }
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
