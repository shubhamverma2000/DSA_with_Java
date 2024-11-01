import java.util.Scanner;

public class TypeCastingAndAutoPromotion {

    public static void main(String[] args) {

        // type casting can be done automatically
        // if smaller datatype is converted into larger dataype-
        // int --> float
        // char --> String
        Scanner input = new Scanner(System.in);
        String a = input.next();
        System.out.println(" a : " + a);

        //automatic type conversion

        //int -> float , float -> double
        float b = input.nextInt();
        double c = input.nextFloat();

        // TYPE_CONVERSION || TYPE-CASTING

        //explicitly type casting from float to integer
        int d = (int)input.nextFloat();
        float e = (float) input.nextDouble();
        System.out.println("d " + d);


        //Auto - promotion
        char charA= 'a';
        int i = 10;
        float floatNum = 10.0f;
        double num = 10.989384d;

        //  (float)   +    (float)  - (double)  -----> double
        // charA * 2.0 + i/floatNum - num
        System.out.println(charA * 2.0 + i/floatNum - num);

        //result = double (184.010616)
    }
}
