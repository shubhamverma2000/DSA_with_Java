package BinarySearch;

//Same as the ceiling of a number

public class SmallestLetterGreaterthanTarget {
    public static void main(String[] args){
        char[] letters= {'a', 'b', 'c', 'e', 'g', 'j', 'k'};
        System.out.println(nextGreatestLetter(letters, 'f'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int s= 0;
        int e= letters.length - 1;

        while(s<=e){
            int mid= s + (e-s)/2;
            //ignore when letters[x] ==target
            if(letters[mid] <= target ){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }

        // if(s == letters.length){
        //     return letters[0];
        // }else{
        //     return letters[s];
        // }


        //instead of using if-else condition I can also use '%'
        return letters[s % letters.length];

    }
}
