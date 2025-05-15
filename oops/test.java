package oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class test {

    public static void main(String[] abc) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //     int a[]={-3,-2,0,11,15,-6,-8};
        //     int s=0;
        //     float avg=0;
        //     for (int i=0;i<a.length;i++) {
        //         if(a[i]>0){
        //             s=s+a[i];
        //             avg++;
        //         }
        //     System.out.print(s);
        //     }
        // try (Scanner obj = new Scanner(System.in)) {
        //     System.out.println("Enter your Name");
        //     String name = obj.nextLine();
        //     int age = obj.nextInt();
        //     System.out.println("Name is: " + name);
        //     System.out.println("Age is: " + age);
        // }

        System.out.println("Enter your Name");
        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }
}
