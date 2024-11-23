package BinarySearch;


//leetcode  852. Peak Index in a Mountain Array

public class PeakInMountainArray {

    public static void main(String[] args) {
        int[] arr = {0,2,3,1,0};

        int index =  peakIndexInMountainArray(arr);
        System.out.println(arr[index]);
    }
    public static int peakIndexInMountainArray(int[] arr) {

        int s = 0;
        int e = arr.length -1;

        //we ignored the equal sign because loop will break when there is a single element left hence there will be no mid+1 element to compare to
        //the answer will be the last element that is present in the array
        while(s<e){
            int mid = s + (e-s)/2;
            if(arr[mid]<arr[mid+1]){
                s=mid+1;
            }else{
                e=mid;   //possible answer
            }
        }
        return s;
    }

}
