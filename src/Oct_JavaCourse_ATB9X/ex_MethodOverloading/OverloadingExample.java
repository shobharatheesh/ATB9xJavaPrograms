package Oct_JavaCourse_ATB9X.ex_MethodOverloading;

public class OverloadingExample {

    public static void main(String[] args) {

        Calculator  calc = new Calculator();

        System.out.println("Add two integers: "+calc.add(5,10));
        System.out.println("Add three integers: "+calc.add(5,10,15));
    }
}
