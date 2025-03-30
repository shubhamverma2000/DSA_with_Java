package OOPS.Singleton;

public class SingletonClass {
    //Only one object is created, so I don't want to allow people to able to use the constructor of this class-
    //make constructor private
    private SingletonClass(){

    }

    //to store the only one object that is being created
    private static SingletonClass instance;

    //create that one object, or if other time it is requested do not create a new object but give that object only
    public static SingletonClass getInstance(){

        //check if instance is created for the first time, if yes create one
        if(instance==null){
            instance = new SingletonClass();
        }

        //or else return the first object itself
        return instance;
    }
}
