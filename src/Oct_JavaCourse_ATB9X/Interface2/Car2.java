package Oct_JavaCourse_ATB9X.Interface2;

//class that implements the interface
public class Car2 implements Vehicle2 {


    void display()
    {
        start();
        stop();
    }

    @Override
    public void start() {

        System.out.println("Car is starting");

    }


    @Override
    public void stop() {
        System.out.println("Car is Stopping");
    }
}
