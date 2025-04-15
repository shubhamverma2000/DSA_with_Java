package OOPS.Singleton;

public class AnotherSingletonClass {
    AnotherSingletonClass(){

    }
    private final static AnotherSingletonClass instance = new AnotherSingletonClass();

    public static AnotherSingletonClass getInstance() {
        return instance;
    }
}
