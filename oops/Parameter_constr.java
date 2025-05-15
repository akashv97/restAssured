package oops;

public class Parameter_constr {

    String name;
    int id;

    public Parameter_constr(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // public static void main(String[] args) {
    //     Parameter_constr geek1 = new Parameter_constr("Akash", 24);
    //     System.out.println("Name: " + geek1.name + " ID: " + geek1.id);
    // }

    
}

class abcd{
    public static void main(String[] args) {
        Parameter_constr geek1 = new Parameter_constr("Akash", 24);
        System.out.println("Name: " + geek1.name + " ID: " + geek1.id);
    }

}