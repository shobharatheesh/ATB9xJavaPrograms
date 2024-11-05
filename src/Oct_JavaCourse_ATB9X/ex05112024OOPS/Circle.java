package Oct_JavaCourse_ATB9X.ex05112024OOPS;

public class Circle {

    //attributes
    double pie ;
    double radius ;

    //constructor

    Circle(double pie , double radius)
    {
        this.pie = pie;
        this.radius = radius;
    }

    //behaviour

    double areaCircle()
    {
        return pie * radius * radius;
    }

    double CircumCircle()
    {
        return 2 * pie * radius;
    }


}
