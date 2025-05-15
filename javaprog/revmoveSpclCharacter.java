package javaprog;

public class revmoveSpclCharacter {

    public static void main(String[] args) {
        String str = "Hello@World!123#Java$%";
        for (char ch:str.toCharArray()) {
            // Prints numberAndSpclCharacter

            if(!Character.isLetter(ch)){
                System.out.print(ch);
            }
            // print only spclChar

            // if(!Character.isLetterOrDigit(ch)){
            //     System.out.print(ch);
            // }
            
            // print only digit

            // if(Character.isDigit(ch)){
            //     System.out.print(ch);
            // }
            
            

        }

    }

}
