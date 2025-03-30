package OOPS.Static;

public class Main {
    public static void main(String[] args) {

        //outer class ->normal ||  inner class -> static
        StaticClass.InnerStaticClass obj = new StaticClass.InnerStaticClass("Shubham");  //object of static class has been created but not of the outer class
        StaticClass.InnerStaticClass obj2 = new StaticClass.InnerStaticClass("Suyash");

        System.out.println("obj.name " + obj.name);         //output "Shubham"
        System.out.println("obj2 name " + obj2.name);       //output "Suyash"  this is because static inner class is mentioned inside the outer class so outer class is not needed to instantiate,
                                                                            // but the static class needs on object


        //outer class ->normal ||  inner class -> normal
        NormalClass normalClass = new NormalClass();
        NormalClass.InnerNormalClass innerNormalClass = normalClass.new InnerNormalClass(); //both the objects are needed to be created
    }
}
