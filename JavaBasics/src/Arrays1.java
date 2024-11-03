import java.util.Scanner;
import java.util.Arrays;

public class Arrays1 {

    public static void main(String[] args) {

//        Arrays
//        Collection of similar datatypes in one reference variable

//        syntax

//        datatype[] variable_name = new dataType[size];

//        initializing
        String[] names = new String[4];

//        initializing and declaring
        int[] rollNo = {1, 2, 3};

        float[] ros;  //declaration of array, but not pointing to memory in heap, so, getting defined in STACK

        ros = new float[5];  //ros is allocated memory in HEAP. (Initialisation)
        System.out.println(ros[0]);

//        ros[0]---- all elements are zero by default for the primitive integer types


        String[] departments = new String[5];
//      Since String is not a primitive datatype and is an object hence it's value is NULL by default.
//      String is an object so, this array is the collection of objects which in heap memory are actually the reference variables
//        which are pointing towards the the actual departments[0]... objects
//        Therefore NULL!

        System.out.println(departments[0]); // this is NULL by default

        //Arrays
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];
        System.out.println("Please enter the values of the array");
        for(int i =0;i<arr.length;i++){
            arr[i]= in.nextInt();
        }

        System.out.println(Arrays.toString(arr));
    }
}
