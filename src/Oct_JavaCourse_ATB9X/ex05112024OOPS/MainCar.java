package Oct_JavaCourse_ATB9X.ex05112024OOPS;

public class MainCar {
    public static void main(String[] args) {

        //create an object of Car class

        Car myCar = new Car("Red", "Toyota Camry", 2024); // memory will be allocated when object is created

       //Access attributes

        System.out.println("My car is a  " + myCar.color + " "+myCar.model + " "+myCar.year);

        //call methods

        myCar.drive();

    }
}
