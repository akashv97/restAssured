package javaprog;

public class reverseLastApp123 {
    public static void main(String[] args) {
        String str="My Name Is Akash";
        String[] part=str.split(" ");
        String last=part[part.length-1];
        String sb= "123" + new StringBuilder(last).reverse().toString();
        String sb1= "123" + new StringBuffer(last).reverse().toString();
        // String r=sb.replace(last, sb);
        // System.out.println(r);
        String r=str.replace(last, sb);
        String r1=str.replace(last, sb1);
        System.out.println(r);
        System.out.println(r1);
    }
    
}
