package Oct_JavaCourse_ATB9X.SuperKeyword;

public class Car extends Vehicle {

    private int maxspeed = 281;

    @Override
    void display() {
        System.out.println("Child");
    }

    Car()
    {
        //super();  without calling super() explicitly the default constructor will be called from parent
        //super(10);
        System.out.println("Default Constructor");
        System.out.println(this.maxspeed);
        System.out.println(super.maxSpeed);
        this.display();
        super.display();






    }

}

