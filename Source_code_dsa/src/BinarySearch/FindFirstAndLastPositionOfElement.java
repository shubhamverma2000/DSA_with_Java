package BinarySearch;

//      Leetcode
//      34. Find First and Last Position of Element in Sorted Array-

//        Approach -
//                1. we can put if conditions inside - when we get out target element
//                2. We can run binary search twice to find first and last occurences seperately - 2log(n) -> log(n)


public class FindFirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,9,14,16,18};
        System.out.println(searchRange(nums, 15));
    }


    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int s= 0;
        int e= nums.length -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            //because we want to find the range, hence when we find the target we know that the answer lies between
            // s and e range
            // so we will move the pointers-s , e likewise
            if(nums[mid]==target){

                if(nums[s]==target){
                    ans[0]=s;
                    if(nums[e]==target){
                        ans[1]=e;
                        break;
                    }else{
                        e--;
                    }

                }else{
                    //nums[e]==target
                    ans[1]=e;
                    s++;
                }

            }else if(nums[mid] >target){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return ans;
    }

}
