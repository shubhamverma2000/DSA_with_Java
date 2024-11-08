package BinarySearch;

public class CeilingOfNumber {

    public static void main(String[] args) {
        int[] nums= {1,2,3,4,9,14,16,18};
        System.out.println(searchInsert(nums, 15));
    }

    public static int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e-s)/2;
            if(nums[mid]<target){
                s =mid+1;
                ans=mid;
            }else{
                e=mid-1;
            }
        }

        return ans+1;
    }
}
