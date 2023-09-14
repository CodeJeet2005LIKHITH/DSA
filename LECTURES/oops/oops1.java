package LECTURES.oops;

import java.util.Arrays;

public class oops1 {
//    class are template custom data types
    public static void main(String[] args) {


        class Student{
            int rollNo;
            String Name;
            String Address="10-135";
        }
        Student Student1;
       Student []Students = new Student[5];
        System.out.println(Arrays.toString(Students));
}
}
