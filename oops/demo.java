package oops;
public class demo {
    public static void main(String[] args) {
        oops st1;
        st1 = new oops();
        st1.StudentID=123;
        st1.studentName="Ram";
        st1.studentCity="xys";
        st1.study(); 
        st1.showFullDeails();

        oops st2;
        // st2=new oops(12);
        st2=new oops();
        st2.StudentID=120;
        st2.studentName="abcd";
        st2.studentCity="banglore";
        st2.study(); 
        st2.showFullDeails();
        st2.study("Akash"); 
    }
}
