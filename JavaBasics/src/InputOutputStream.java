import java.util.Scanner;

public class InputOutputStream {

    public static void main(String[] args) {

        //Output
        //Class "System"
        // public static final PrintStream out = null; is the
        //println is the method inside the PrintStream class which takes the string prints it and then takes it to new line
        System.out.println("hello world");

        //PRINT IN SAME LINE
        System.out.print("hello");


        //Input

        //Scanner class // there is also buffer reader
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number - ");
        int num1= input.nextInt();
        System.out.println("number is "+ num1);

        String message= input.nextLine();
        String c = input.next();

        //to type bigger numbers, instead of using the commas, we can use the _
        int num2 = 2_00_000;

        System.out.println("num2 "+ num2);
    }
}
