package oops;
public class single_level_inheritance {
    public void print_geek()
    {
        System.out.println("Geeks");
    }
}

class Two extends single_level_inheritance {
    public void print_for() { System.out.println("for"); }
}

// Driver class
class Main {
      // Main function
    public static void main(String[] args)
    {
        Two g = new Two();
        g.print_geek();
        g.print_for();
        g.print_geek();
    }
}
