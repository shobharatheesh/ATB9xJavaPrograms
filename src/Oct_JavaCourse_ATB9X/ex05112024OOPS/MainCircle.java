package Oct_JavaCourse_ATB9X.ex05112024OOPS;

public class MainCircle {
    public static void main(String[] args) {
        Circle c = new Circle(3.14 , 4);

        System.out.println("Area of the circle : " +c.areaCircle());
        System.out.println("Circumference : " + c.CircumCircle());
    }
}
