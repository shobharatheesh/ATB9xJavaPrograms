package Oct_JavaCourse_ATB9X.Abstraction;

public class MainRunnerClass {

    public static void main(String[] args) {

        Circle c = new Circle(5.0);
        c.display();

        System.out.println("Area: "+c.area());
    }
}
