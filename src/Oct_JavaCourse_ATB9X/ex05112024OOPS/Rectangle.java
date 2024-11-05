package Oct_JavaCourse_ATB9X.ex05112024OOPS;

public class Rectangle {

    //attributes
    double length;
    double width;

    //constructor

    Rectangle(double length , double width)
    {
        this.length = length;
        this.width = width;
    }

    //behaviour or Method to calculate area

    public double calculateArea(){
        return length * width;
    }

    //Method to calculate Perimeter
    public double calculatePerimeter()
    {
        return 2+(length * width);
    }



}

