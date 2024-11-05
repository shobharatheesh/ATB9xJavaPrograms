package Oct_JavaCourse_ATB9X.ex05112024OOPS;

public class Calculator {

    //attributes
    double num1;
    double num2;

    //constructor
    Calculator(double num1, double num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    //method for sum and subtraction
    double sum()
    {
        return num1+num2;
    }
    double subtraction()
    {
        return num1-num2;
    }

}
