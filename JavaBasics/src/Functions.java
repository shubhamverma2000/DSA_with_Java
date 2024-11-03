public class Functions {

    //functions
    //function overloading
    // Variable args


    static void greet(String name){
        System.out.println("Helllo " + name);
    }


    // VAR_ARGS when we do not know the the number of arguments that are going to be received,
    // we use '...' and it stores all the argumennts in an array of that type of argument
    //if there are multiple different types' arguments, we must use the varArgs at last.

    static int sum(String name, String lastName, int ...v){
        int sum = 0;
        for(int i : v){
            sum+=i;
        }
        return sum;
    }


    //method overloading
    // it is achieved at compile time, when by identifying the signature of the method, the call to right method is taken
    // method can have the same name, but it can differ by
    // no. of arguments, type of arguments,
    static int sum(int a, int b, int c){
        return a+b+c;
    }

    static int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        greet("Shubham");

        //variable arguments --> varargs
        sum("Shubhamm", "Verma", 2, 3, 45);


        //third function called, because it has two arguments
        sum(2,3);

        //second called , because of 3 arguments
        sum(4, 5,6);

    }
}
