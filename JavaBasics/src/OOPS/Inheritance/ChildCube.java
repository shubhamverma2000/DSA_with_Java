package OOPS.Inheritance;

public class ChildCube extends ParentShape{

    public Integer weight;

    public ChildCube(Integer width, Integer length, Integer height, Integer weight) {
        //super has to be the first statement in a constructor
        super(width, length, height);
        this.weight = weight;
    }

    public ChildCube() {
    }
}
