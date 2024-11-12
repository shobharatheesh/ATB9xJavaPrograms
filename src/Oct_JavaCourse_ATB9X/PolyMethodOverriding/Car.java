package Oct_JavaCourse_ATB9X.PolyMethodOverriding;

public class Car extends Vehicle {
    /**
     *
     */
    @Override
    public void start() {
        super.start();
        System.out.println("Car is starting");
    }
}
