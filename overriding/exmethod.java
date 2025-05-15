package overriding;

// class methodoverriding {
//     public void parent(){
//         System.out.println("hello");
//     }
    
// }

// class child extends methodoverriding{
    
// }    

// public class exmethod{
//     public static void main(String[] args){
//         methodoverriding c1= new child();
//         c1.parent();
//     }

// }


// class Parent {
//     public void m1(){
//         System.out.println("hello");
//     }
    
// }

// class child extends Parent{
//     public void m1(){
//         System.out.println("hello world");
//     }
    
// }    

// public class exmethod{
//     public static void main(String[] args){
//         Parent c1= new child();
//         c1.m1();
//     }

// }



class Parent {
    public void m1(){
        System.out.println("hello");
    }
    
}

class child extends Parent{
    public void m1(){
        super.m1();
        System.out.println("hello world");
    }
    
}    

public class exmethod{
    public static void main(String[] args){
        //down line has no issue work same
        //Parent c1= new child();
        child c1= new child();
        c1.m1();
    }

}



// class Parent {
//     protected  void m1(){
//         System.out.println("hello");
//     }
    
// }

// class child extends Parent{
//     public void m1(){
//         super.m1();
//         System.out.println("hello world");
//     }
    
// }    

// public class exmethod{
//     public static void main(String[] args){
//         //down line has no issue work same
//         //Parent c1= new child();
//         child c1= new child();
//         c1.m1();
//     }

// }

// class Animal {
//     public void sound() {
//         System.out.println("Animal makes a sound");
//     }
// }

// class Dog extends Animal {
//     public void sound() {
//         super.sound();
//         System.out.println("Dog barks");
//     }
// }

// class Cat extends Animal {
//     public void sound() {
//         System.out.println("Cat meows");
//     }
// }

// public class exmethod {
//     public static void main(String[] args) {
//         Animal a1 = new Dog();
//         a1.sound(); // Dog barks

//         Animal a2 = new Cat();
//         a2.sound(); // Cat meows
//     }
// }


//co-varient return types

//exp1

// class methodoverriding {
//     public String parent(){
//         System.out.println("hello");
//         return null;
//     }
    
// }

// class child extends methodoverriding{
//     public String parent(){
//         super.parent();
//         System.out.println("hello");
//         return null;
//     }
    
// }    

// public class exmethod{
//     public static void main(String[] args){
//         methodoverriding c1= new child();
//         c1.parent();
//     }

// }

//exmp 2

// class methodoverriding {
//     public methodoverriding parent(){
//         System.out.println("hello");
//         // return null;
//         return new methodoverriding();
//     }
    
// }

// class child extends methodoverriding{
//     public child parent(){
//         System.out.println("hello");
//         // return null;
//         return new child();
//     }
    
// }    

// public class exmethod{
//     public static void main(String[] args){
//         methodoverriding c1= new child();
//         c1.parent();
//     }

// }





