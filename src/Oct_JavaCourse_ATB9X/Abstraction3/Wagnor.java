package Oct_JavaCourse_ATB9X.Abstraction3;

public class Wagnor extends Engine{

    void drive()
    {
        startEngine();
        stopEngine();
    }

    @Override
    void startEngine() {
        System.out.println("starting car");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping car");
    }
}
