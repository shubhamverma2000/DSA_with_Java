package OOPS.Static;

//Outer class can never be Static
public class StaticClass {    //this class does not need to be instantiated to access the inner class which is static
    static int a =0;

    static class InnerStaticClass{  // the object of this class needs to be created to access the method inside it.

        String name;
        void print(){
            System.out.println("inner static class called ");
        }

        public InnerStaticClass(String name){
            this.name = name;
        }
    }

}
