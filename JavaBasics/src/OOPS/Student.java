package OOPS;

public class Student {

    private int rollNo;              //by default =0                   //These are the instance variables
    private String name;            //by default = null
    private Float marks;                    //0.0
    private String[] subjects;              //null

    public Student(String[] subjects2, Float marks, String name, Integer rollNo) {
        subjects = subjects2;  // 'this' keyword refers to the current object , so even if you don't write it, it automatically takes the current obj
        this.marks = marks;
        this.name = name;
        this.rollNo = rollNo;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMarks() {
        return marks;
    }

    public void setMarks(Float marks) {
        this.marks = marks;
    }

    public void greeting(){
        System.out.println("hello ");
    }
}
