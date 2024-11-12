package Oct_JavaCourse_ATB9X.Abstraction3;

public class Tesla extends Engine {

    void drive()
    {
        startEngine();
        stopEngine();
    }


    @Override
    void startEngine() {
        System.out.println("Start the electric engine");
    }

    @Override
    void stopEngine() {

        System.out.println("Stop the electric engine");
    }
}
