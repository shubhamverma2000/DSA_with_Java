package miscellaneous;

import java.util.Scanner;

public class fibonnaciSeries {

    public static void main(String[] args) {

        //Output the nth number of the fibonnaci series -
        // 0, 1, 1, 2, 3, 5, 8, 13, 21

        Scanner input = new Scanner(System.in);
        System.out.print("Output the nth number: ");

        int n = input.nextInt();
        int a = 0;
        int b = 1;

        int count = 1;

        while(count<n){
            int temp = b;
            b = a+b;
            a=temp;
            count++;
        }

        System.out.println("The nth Number is " + a);

    }
}
