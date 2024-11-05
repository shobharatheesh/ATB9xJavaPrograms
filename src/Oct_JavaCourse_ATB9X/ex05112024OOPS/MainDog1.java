package Oct_JavaCourse_ATB9X.ex05112024OOPS;

public class MainDog1 {
    public static void main(String[] args) {

        //creating 5 objects and creating thier attributes

        Dog1 dg1 = new Dog1();
        dg1.name = "Rocky";

        Dog1 dg2 = new Dog1();
        dg2.color ="Brown";

        Dog1 dg3 = new Dog1();
        dg3.age = 3;

        Dog1 dg4 = new Dog1();
        dg4.weight = 12;

        Dog1 dg5 =new Dog1();
        dg5.breed = "Labrodor";

        //displaying information for each attributes

        dg1.displayInfo();
        dg2.displayInfo();
        dg3.displayInfo();
        dg4.displayInfo();
        dg5.displayInfo();


    }
}
