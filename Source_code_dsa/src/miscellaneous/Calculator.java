package miscellaneous;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Enter the operator: ");
            String op = input.next();
            if(op == "-" || op=="+" || op =="%" || op=="*" || op=="/"){
                System.out.print("Enter Your two numbers: ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                switch (op){
                    case "-":
                        System.out.println(num1-num2);
                    case "+":
                        System.out.println(num1+num2);
                }
            }else if(op =="x" || op=="X"){
                break;
            }else{
                System.out.print("Invalid operator");
            }
        }
    }

}
