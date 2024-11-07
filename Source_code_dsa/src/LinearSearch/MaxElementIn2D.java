package LinearSearch;

public class MaxElementIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1,45, 12},
                {67,23,76,2,44,89},
                {82,38,91,73},
                {64,65}
        };

        System.out.println(arr.length==0 ? "Empty Array" :  searchMaxIn2d(arr));
    }

    static int searchMaxIn2d(int[][] arr){
        if(arr.length==0){
            return -1;
        }
        int max =Integer.MIN_VALUE;
        for(int[] sub : arr){
            for(int item : sub){
                if(item >max)
                    max=item;
            }
        }
        return max;
    }
}

