package BinarySearch;


//  LEETCODE 33. Search in Rotated Sorted Array

 // Optmised Approach -

    // 1. find pivot element
    // 2. if pivot is found- then binary on two arrays
    // 3 if oivot not found, - binary search on entire array

    // pivot element- (binary search)
    //     case 1: M > M+1:
    //             PIVOT-> M
    //     case 2: M < M-1
    //             PIVOT -> M-1
    //     case 3: start >= M (then we know that all the elements after M are smaller than start)
    //             e=mid-1;
    //     case 4: start < M
    //             s = M+1    (+1 because if M was pivot it would've ben handled in the case 1 and 2)


//Another optimised and good approach -->       Recursion


public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        int target = 5;
        int index =  searchInRotatedArray(arr, target);
        System.out.println(index);
    }

    public static int searchInRotatedArray(int[] arr, int target){
        int pivotIndex = pivotIndex(arr);
        //if pivot is not found
        if(pivotIndex == -1){
            //means there is no rotation
            return binarySearch(arr, target, 0, arr.length-1 );
        }
        //if pivot is the target
        if(arr[pivotIndex]==target){
            return pivotIndex;
        }

        //find in first array
        if(arr[0] <= target){
            return binarySearch(arr, target, 0, pivotIndex );
        }else{  //find in second array
            return binarySearch(arr, target, pivotIndex+1, arr.length-1);
        }
    }


    private static int pivotIndex(int[] arr) {
        int s=0;
        int e = arr.length-1;

        while(s<=e){
            int mid = s+ (e-s)/2;
            if( mid < e && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > s && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[s] >= arr[mid]){
                e=mid-1;
            }else{
                s=mid + 1;
            }
        }

        return -1;
    }

    private static int binarySearch(int[] arr, int target, int s, int e) {
        while(s<=e){
            int mid = s+(-s)/2;
            if(arr[mid] == target)
                return mid;
            else if (arr[mid]>target) {
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }
}
