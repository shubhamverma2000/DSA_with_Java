package BinarySearch;

import java.util.Arrays;

public class BinarySearchInSortedMatrix {

    public static void main(String[] args){
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(Arrays.toString(search(arr, 9)));
    }

    static int[] search(int[][] arr, int target){

        int row =0;
        int col = arr[0].length; // since the matrix can be empty hence we are not using -1;

        int[] mid = arr[0];
        return new int[]{-1, -1};
    }
}
