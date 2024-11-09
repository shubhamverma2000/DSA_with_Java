package BinarySearch;

public class FloorOfANumber {

    public static void main(String[] args) {
        int[] nums= {1,2,3,4,9,14,16,18};
        System.out.println(floor(nums, 15));
    }

    public static int floor(int[] nums, int target) {
        int s=0;
        int e=nums.length -1;
//        1 3 4 5 9 14 16 17 19    target - 6 -->ans should be 5 index 4

        while(s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid]<target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return e;
    }
}
