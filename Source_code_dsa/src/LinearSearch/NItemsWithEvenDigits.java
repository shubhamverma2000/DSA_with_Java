package LinearSearch;

// Input: nums = [12,345,2,6,7896]
// Output: 2  (12 and 7896 contain even number of integers)

public class NItemsWithEvenDigits {
    public static void main(String[] args) {
//        brute force-

//        num_count  = 0;
//        for loop - array
//          digitsCount =0;
//          while loop - (num!=0)
//              num/=10
//              digitsCount++
//          endWhile
//          if(digitsCount%2==0)
//                count++;
//         endfor
//        return count

        int[] arr= {0, 542,56,7632,258987, 345,23436,901};

        System.out.println(countDigits(arr));
        System.out.println(optmised_CountEvenDigits(arr));
    }

   static int optmised_CountEvenDigits(int[] arr) {
        int count=0;
        for(int num :arr){
            int number = num;
            if(number<0){
                number*=-1;
            }
            int digitsCount = (int)(Math.log10(number)) + 1;   //optmised way to find the number of digits
            if(digitsCount%2==0)
                count++;
        }
        return count;
    }

    static int countDigits(int[] arr){
        int count= 0;

        for(int i=0; i< arr.length;i++){
            int digitsCount=0;
            int num =arr[i];
            if(num<0){
                num*=-1;
            }
            if(num ==0){
                digitsCount=1;
            }
            while(num > 0){
                num/=10;
                digitsCount++;
            }
            if(digitsCount%2==0)
                count++;
        }

        return count;
    }
}
