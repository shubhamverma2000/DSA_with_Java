public class ScopingAndShadowing {

    //Scope
    //functional scope
    //block scope
    //Shadowing

    int d = 67;

    public static void main(String[] args) {
        int a= 10;
        int d = 89;   // this is known as shadowing because it overrides the global scope and shadows it.
        //block scope
        {
            // 'a' cannot be redeclared because 'a' is in gloabal scope,
            // int a=11;

            int b =13;
        }

        // 'b' cannot be resolved because b's lexical scope has closed, hence cannot be accessed outside.
        // System.out.println(b);
    }


    static void func(){
        int a = 20;  //this cannot be accessed outside the scope. ->functional scopen
    }
}
