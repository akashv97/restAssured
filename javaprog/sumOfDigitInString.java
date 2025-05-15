package javaprog;

public class sumOfDigitInString {

    public static void main(String[] args) {
        String str = "Hello 1234World";
        int sum=0;
        for (char ch : str.toCharArray()) {
            if(Character.isDigit(ch)){
                sum+=Character.getNumericValue(ch);
            }

        }

        String r=str.replaceAll("\\d+", String.valueOf(sum));
        System.out.println(r);


        // String sb=str.split(" ")[1];
        // String r=sb.replaceAll("\\d", "");
        // String r1=sum+new StringBuilder(r).toString();
        // System.out.println(r1);
        // String str1="Hello " + new StringBuilder(r1).toString();
        // System.out.println(str1);

    }

}
