public class binarySearch {

//    linear search  --- searching for each element linearly
//    best case - O(1)  -->when element is in first index itself
//    worst case- O(n)  --> when element is in the last index or not present in the array

    public static void main(String[] args) {
        int[] arr = {2, 34, 54, 22, 90 ,65, 8, 3, 19 , 52, 7};
        int[][] arr2D = {
                {1,67, 2},
                {45,3,7,89,2,34},
                {90, 6, 3, 21},
                {4,8}
        };

        int searchnum = 90;
        int index =  search(arr, searchnum);
        System.out.println(searchnum +" is found in index = " + index);

        int searchNum2 = 89;
        String ans = search2DArray(arr2D, 89);
        System.out.println(searchNum2  +" that is found in index = " + ans ==null? "-1" : ans);

    }

    static int search(int[] arr, int num){
        for(int i=0; i< arr.length;i++){
            if(arr[i] == num){
                return i;
            }
        }
        return -1;
    }

    static String search2DArray(int[][] arr2D, int num) {
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if (arr2D[i][j] == num) {
                    return "arr2D[" + i + "][" + j + "]";
                }
            }
        }
        return null;
    }

}
