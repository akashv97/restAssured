package oops;

public class oops {

    //data:data members:instance variables
    int StudentID;
    String studentName;
    String studentCity;

    public oops() {
        this(67,"Shubham");
        System.out.println("creating object");
    }

    // Constrctor Overloading
    public oops(int s1,String studentName) {
        System.out.println("Value is :" + s1);
        System.out.println("Name  is :" + studentName);
        System.out.println("Parameterrized Constuctor");
    }

    //Behaviour:member methods:methods(function)
    public void study() {
        System.out.println(studentName + " is studying");
    }

    //method overloading
    public void study(String studentName) {
        this.study();
        System.out.println(studentName + " is not studying");
    }

    public void showFullDeails() {
        System.out.println("My name is " + studentName);
        System.out.println("My id is " + StudentID);
        System.out.println("My city is " + studentCity);
    }
}

// class demo {

//     public static void main(String[] args) {
//         oops st1;
//         st1 = new oops();
//         st1.StudentID = 123;
//         st1.studentName = "Ram";
//         st1.studentCity = "xys";
//         st1.study();
//         st1.showFullDeails();

//         oops st2;
//         st2 = new oops(12);
//         st2.StudentID = 120;
//         st2.studentName = "abcd";
//         st2.studentCity = "banglore";
//         st2.study();
//         st2.showFullDeails();
//         st2.study("Akash");
//     }
// }
