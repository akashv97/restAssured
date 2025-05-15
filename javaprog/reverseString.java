package javaprog;

public class reverseString {
    public static void main(String[] args) {
        // String str="I Love Coding";
        // String rev="";
        // for(int i=str.length()-1;i>=0;i--){
        //     rev=rev+str.charAt(i);
        // }
        // System.out.println(rev);

        // using StringBuilder

        // StringBuilder sb=new StringBuilder();
        // sb.append(str);
        // StringBuilder rev=sb.reverse();
        // System.out.println(rev);

        // Using StringBuffer

        // StringBuffer sb= new StringBuffer(String.valueOf(str));
        // StringBuffer rev=sb.reverse();
        // System.out.println(rev);

        // o/p= olleh dlrow
        String str="Hello World";
        String[] words=str.split(" ");
        StringBuilder r=new StringBuilder();
        for(String word:words){
            StringBuilder sb=new StringBuilder(word);
            r.append(sb.reverse()).append(" ");
        }
        System.out.println(r.toString().trim());


    }
}
