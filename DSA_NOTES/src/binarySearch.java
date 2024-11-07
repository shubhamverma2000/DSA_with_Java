public class binarySearch {

//    binary search  --- searching for each element by dividing a sorted array in two, and then comparing the middle element
//    best case ---> O(1)
//    worst case- O(log(n))

    public static void main(String[] args) {
        int[] arr = {2, 31, 54, 72, 90 ,95, 98, 103, 119 , 152, 117};
        int[][] arr2D = {
                {1,67, 2},
                {45,3,7,89,2,34},
                {90, 6, 3, 21},
                {4,8}
        };

        int searchnum = 90;
        int index =  search(arr, searchnum);
        System.out.println(index==-1 ? "Not found " :  searchnum +" is found in index = " + index);


    }

    static int search(int[] arr, int num){
      int start = 0;
      int end = arr.length-1;
      while(start<=end){

          int mid = start + (end-start)/2;
          if(arr[mid]==num)
              return mid;
          else if (arr[mid] > num)
              end=mid-1;
          else
              start=mid+1;
      }
      return -1;
    }

}
