package miscellaneous;

import java.util.Scanner;

public class PrimeNumberOptmised {

    public static void normalPrimeCheck(int num){
        int n=2;
        while(n<num){
            if(num % n==0){
                System.out.println("Not a Prime Number");
                break;
            }
            n++;
        }
        if(n==num){
            System.out.println("Prime number");
        }
    }

    public static void optmisedPrimeCheck(int num){
        //num=36

        // 1 * 36 = 36      _
        // 2 * 18 = 36       |
        // 3 * 12 = 36       | --->  this is repeated in the next few lines, so we should only check the square
        // 4 * 9  = 36       |       should be less than the number
        // 6 * 6  = 36      _|
        // 9 * 4  = 36
        // 12 * 3 = 36
        // 18 * 2 = 36
        // 36 * 1 = 36

        // this reduces the loops to sqrt(n)
        int n=2;
        while(n*n < num){
            if(num % n==0){
                System.out.println("Not a Prime Number");
                break;
            }
            n++;
        }
        if(n==num){
            System.out.println("Prime number");
        }
    }

    public static void main(String[] args) {
        //normal prime number check

        Scanner input = new Scanner(System.in);
        System.out.print("Output the number to check : ");


        int num = input.nextInt();

        normalPrimeCheck(num);

        optmisedPrimeCheck(num);
    }
}
