package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lists {

    public static void main(String[] args){

        List<Integer> list = new ArrayList<>();
        //default capacity -> 10 but size is 0
        //enhances the size by 1.5 times, copies the old array into new at O(n)

        //Manually define the capacity -->

        List<Integer> list1 = new ArrayList<>(5);

        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);

        // this will increase the capacity by 1.5x
        list1.add(1);

        //but when we remove elements, it doesn't auto shrink its capacity->

        // to shrink the size manually- trimToSize() but this is the method of class and parent cannot access the child methods
//        list1.trimToSize();

        ArrayList<Integer> list2 = new ArrayList<>(5);

        list1.add(4);
        list1.add(3);
        list1.add(2);
        list1.add(2);
        list1.add(2);

        // to shrink the size manually- trimToSize()
        //this is possible because the here child reference is present and parent is not trying to access child class method
        list2.trimToSize();


        //Change the array into
        Integer[] arr = {1,3,2,1,4,5};
        List<Integer> arrayAsList = Arrays.asList(arr);

        // this List is made of the array which has a constant size so it cannot have flexible size, and we cannot add items into it
        // but we can replace the items.


        arrayAsList.set(2,56);  //set index 2 as 56

        arrayAsList.sort(null);

    }



}
