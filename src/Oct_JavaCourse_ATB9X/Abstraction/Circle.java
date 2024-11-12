package Oct_JavaCourse_ATB9X.Abstraction;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius)   //parameterized constructor
    {
        this.radius = radius;
    }

    //Providing implementation of abstract method

    /**
     * @return
     */
    @Override
    double area() {
        return 3.14*radius*radius;
    }
}
