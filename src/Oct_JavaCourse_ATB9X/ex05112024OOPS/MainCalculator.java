package Oct_JavaCourse_ATB9X.ex05112024OOPS;

public class MainCalculator {

    public static void main(String[] args) {

        Calculator calc = new Calculator(23,45);

        calc.sum();
        calc.subtraction();

        System.out.println("Sum : " + calc.sum());
        System.out.println("Subtraction : "+ calc.subtraction() );


    }
}
