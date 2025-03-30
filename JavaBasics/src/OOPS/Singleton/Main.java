package OOPS.Singleton;

import OOPS.Static.NormalClass;
import OOPS.Static.StaticClass;

public class Main {
    public static void main(String[] args) {

        //all the objects point to the same instance of the class, since only one object is created

       SingletonClass obj  = SingletonClass.getInstance();

        SingletonClass obj2  = SingletonClass.getInstance();
        SingletonClass obj3  = SingletonClass.getInstance();


    }
}
