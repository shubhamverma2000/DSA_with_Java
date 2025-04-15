package Strings;

public class Palindrome {

    private static Boolean palindromeString(String literal){
        int s = 0;
        int e=literal.length()-1;

        //abcba
        while(s<e){
            if(literal.charAt(s)==literal.charAt(e)){
                s++;
                e--;
            }
            else return false;
        }
        return true;
    }

    public static void main(String[] args){
        String literal = "aabaa";
        if(palindromeString(literal)){
            System.out.println("Yes it is a palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
