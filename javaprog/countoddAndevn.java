package javaprog;

public class countoddAndevn {
    public static void main(String[] args) {
        int n=145678;
        int o_c=0;
        int e_c=0;
        int r=0;
        while(n>0){
            r=r*10+n%10;
            n=n/10;
            if(r%2==0){
                e_c+=1;
            }
            else{
                o_c+=1;
            }
        }
        
        System.out.println("Even: "+ e_c + " " + "Odd: "+o_c);
      
    }
    
}
