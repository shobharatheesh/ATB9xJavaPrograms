package Oct_JavaCourse_ATB9X.Interface3;

public class SmartCar implements InterfaceVehicle , InterfaceGPS {

    @Override
    public void navigates(String Destination) {
        System.out.println("Navigating to: "+Destination);

    }

    @Override
    public void start1() {
        System.out.println("Starting car");
    }


    @Override
    public void stop1() {
        System.out.println("Stopping car");
    }
}
