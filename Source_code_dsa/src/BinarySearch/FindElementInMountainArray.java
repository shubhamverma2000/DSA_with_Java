package BinarySearch;


//Leetcode-   1095. Find in Mountain Array




//APPROACH -->

// 1. Find peak element
// 2. we get two sorted sub arrays, one ascneding and other descending
// 3. binary search on both of them, and accept the minimum one.

// complexity--> O(3log(n)) --> O(log(n))

public class FindElementInMountainArray {

    public static void main(String[] args) {
        int[] arr = {0,2,3,1,0};

        int index =  findInMountainArray( 0 , arr);
        System.out.println(arr[index]);
    }

    public static int findInMountainArray(int target, int[] mountainArr) {
        int peakIndex = peakElement(mountainArr);
        if(mountainArr[peakIndex] != target){

            int elementInAscendingArray = binarySearch(mountainArr, target , true, peakIndex);
            if(elementInAscendingArray == -1 ){
                int elementInDescendingArray = binarySearch(mountainArr, target , false, peakIndex);
                return elementInDescendingArray;
            }else{
                return elementInAscendingArray;
            }

        }else{
            return peakIndex;
        }
    }

    public static int peakElement( int[] mountainArr){
        int s =0;
        int e = mountainArr.length -1;
        while(s<e){
            int mid = s+(e-s)/2;
            if(mountainArr[mid] > mountainArr[mid+1]){
                e=mid;
            }else{
                s=mid+1;
            }
        }
        return s;
    }
    public static int binarySearch( int[] mountainArr, int target, boolean isAsc, int peakIndex){
        int s,e;
        if(isAsc){
            s=0;
            e=peakIndex;
        }else{
            s=peakIndex;
            e=mountainArr.length-1;
        }

        while(s<=e){
            int mid = s+(e-s)/2;
            if(mountainArr[mid] == target){
                return mid;
            }else if(mountainArr[mid] < target){
                if(isAsc){
                    s=mid+1;
                }else{
                    e=mid-1;
                }
            }else{
                if(isAsc){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }
        }

        return -1;
    }
}
