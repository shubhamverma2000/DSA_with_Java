import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    //ArrayList - Collection framework
    //Why do we need ArrayList when we have Arrays?

//    Arrays are of fixed size, but what if I don't know the size before initialising the values?
//    Suppose I want to input the size of array at runtime and then initialise the array with that size
//    Dynamic Size Allocation and multiple functionality allowed
//    Similar to vector in C++

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];   //static size and cannot be changed at runtime

        //We cannot add primitive datatypes into it, we use Wrapper classes instead
        ArrayList<Integer> arryList = new ArrayList<>(1); //though the initial capacity is 1 still we could add 2 elements
        arryList.add(23);
        arryList.add(45);

        System.out.println(arryList);


        ArrayList<Integer> list = new ArrayList<>(10);

        for (int i = 0; i < 2; i++) {
            list.add(in.nextInt());
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

// though the initial capacity is 1 still we could add 2 elements. WHY?
// Because on adding certain number of items, it doubles its sizes.


