import java.util.Arrays;

public class PassByValue {

    static void updateValue(int a){
        a = 45;
    }
    static void updateArr(int[] arrs){
        arrs[0] = 23;
    }
    public static void main(String[] args) {
        int a =10;
        int[] arr = {1,3,42,67,2};
        updateValue(a);
        updateArr(arr);

        //this does not get updated
        //primitive type are passed by values, the copy of reference variable is created
        System.out.println("a : " + a);

        //JAVA does not support the pass by reference, but the original object is passed. and
        //new reference variable points to the object.
        System.out.println("arrr : " + arr[0]);
    }
}