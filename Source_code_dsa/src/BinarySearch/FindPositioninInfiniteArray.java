package BinarySearch;

//Find position of Element in infinite array

public class FindPositioninInfiniteArray {

//    infinite array
//    Assume that this array is a normal array , but we cannot use the 'length method';

    public static void main(String[] args) {
        int[] arr = {2, 31, 54, 72, 90 ,95, 98, 103, 119 , 152, 117, 120, 156 };   //assume that this is an infinite array
        int target = 119;
        long s = 0L;
        long e= 1L;

//        while(true){
//            if(arr[(int) e] < target){
//                long temp= e+1 +  2*(e-s);
//                s=e+1;
//                e=temp;
//            }else{
//                System.out.println(binarySearch(arr, target, (int)s, (int)e));
//                break;
//            }
//        }


//        OR

        while(target > arr[(int) e]){
            long temp= (e+1) +  2 * (e-s);
            s=e+1;
            e=temp;
        }

        System.out.println(binarySearch(arr, target, (int)s, (int)e));
    }

    static int binarySearch(int[] arr, int num, int start , int end){

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
