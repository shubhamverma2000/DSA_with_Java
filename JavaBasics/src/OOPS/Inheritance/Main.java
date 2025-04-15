package OOPS.Inheritance;

public class Main {
    public static void main(String[] args){
        ParentShape shape = new ParentShape(2,4,6);

        //Because it is a type of parent, and parent is referring to the object of child, but the parent cannot access the values of child

        //Here parent is referring to child object

//        You're creating a ChildCube object.
//
//        But you're referencing it using a ParentShape variable: ParentShape cube.
//
//        Then you're trying to access .weight from that reference.
        ParentShape cube = new ChildCube(2,4,5,6);

        // We are trying to access a field from parent which does not exists.
        Integer weight = cube.weight;


        //Fix- Parse the parent to child
        Integer fixedWeight = ((ChildCube)cube).weight;



        // We cannot refer parent object from a child
        // strictly type-safe, and it does not allow implicit downcasting — because:
        //A ParentShape is not necessarily a ChildCube.
//
//        In real-world terms:
//
//        Every Dog is an Animal ✅
//
//        But not every Animal is a Dog ❌
        ChildCube childCube = new ParentShape();


    }
}
