import java.util.Arrays;
import java.util.Scanner;

public class Arrays2D {
    /*
        [
            [1,2,3],
            [4,5],
            [6,7,8,9]
        ]
    */


    public static void main(String[] args) {
        //2D Arrays are the Array of Arrays- which is the collection of Arrays of similar datatype.

//        SYNTAX -
//        datatype[][] reference_variable = new datatype[3][];

//        mentioning row is necessary but column is optional. Because in memory allocation the allocation of
//        the bigger array is done first which contains the size of the array and then the allocation of
//        columns.

//        stack --> reference variable    ------------  [arr[0], arr[1], arr[2]] <------HEAP

//        HEAP --> collection of reference variable pointing towards the sub-arrays.

        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];

        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                arr[i][j] = in.nextInt();
            }
        }

        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        //OR
        for(int i =0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        //OR
        for(int[] subarr : arr){
            System.out.println(Arrays.toString(subarr));
        }
    }
}
