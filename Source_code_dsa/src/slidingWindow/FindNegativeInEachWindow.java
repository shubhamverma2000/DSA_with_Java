package slidingWindow;

import java.util.ArrayList;
import java.util.List;

public class FindNegativeInEachWindow {

    private static List<Integer> findNegativeInteger(Integer[] array, int k){
       List<Integer> ans = new ArrayList<>();
       List<Integer> negativeIndices = new ArrayList<>();

       for(int i=0; i< array.length;i++){  //[-8, 2, 3, -6, 10]
           if(array[i]<0){
               negativeIndices.add(i);         //  [0,3]
           }
       }
       int negativePtr=0;

       int s = 0, e=k-1;

       while(e < array.length){

       }
        return ans;
    }


    public static void main(String[] args){
        Integer[] array = {-8, 2, 3, -6, 10};
        int k = 2;
        System.out.println(findNegativeInteger(array, k).stream().toList());
    }
}

//e=s+k-1;
//           Boolean found = false;
//           for(int i=s; i<=e; i++){
//               if(array[i]<0){
//                   ans.add(array[i]);
//                   found =true;
//                   break;
//               }
//           }
//           if(!found){
//               ans.add(0);
//           }
//           e++;
//           s++;


