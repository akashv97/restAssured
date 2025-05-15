package codes;

//Write a program to take an array of integers as input and calculate the sum of all elements in the array.

public class sumofarrays {

    static public void main(String[] args){
        int [] arr={1,2,3,10,4,5};
        int k=3;
        int n=arr.length;
        k=k%n;
        int last=0;
        for (int i=0; i<k;i++){
                last=arr[n-1];
            
        }
        System.out.println(last);
    }

    
    
    
}
