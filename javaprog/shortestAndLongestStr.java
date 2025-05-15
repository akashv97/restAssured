package javaprog;

public class shortestAndLongestStr {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "kiwi", "grapefruit", "pear"};
        String s=words[0];
        String l=words[0];
        if(words.length==0){
            System.out.println("Array Is Empty");
        }
        for(String word:words){
            if(word.length()>l.length()){
                l=word;
            }
            if(word.length()<s.length()){
                s=word;
            }
        }
        System.out.println("Longest: "+ l + " "+ "Shortest: "+ s);

    }
}
