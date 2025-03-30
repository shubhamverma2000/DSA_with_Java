package OOPS;

public class FinaliseKeywordGarbageC {
    public static void main(String[] args){
        Main a;
        for(int i=0; i<1000000000;i++){  //for small number it won't call garbage collector, it will only call when there is load
            a=new Main("random name");
        }
    }
}

class Main{
    final int num=10;
    String name;

    public Main(String name) {
        System.out.println("object created");
        this.name = name;
    }

    //what needs to be done when the object is being destroyed
    @Override
    protected void finalize() throws Throwable{
        System.out.println("object destroyed");
    }
}
