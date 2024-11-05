package Oct_JavaCourse_ATB9X.ex05112024OOPS;

public class MainDog2 {
    public static void main(String[] args) {

        // Creating 5 Dog objects
        Dog2 dog1 = new Dog2("Buddy", "Golden Retriever", 3, "Golden", 30.5);
        Dog2 dog2 = new Dog2("Max", "Beagle", 5, "Brown and White", 12.3);
        Dog2 dog3 = new Dog2("Bella", "Labrador", 4, "Black", 25.0);
        Dog2 dog4 = new Dog2("Charlie", "Poodle", 2, "White", 10.2);
        Dog2 dog5 = new Dog2("Rocky", "German Shepherd", 6, "Black and Tan", 35.8);

        //Displaying information and calling behaviors of each dog object

       dog1.displayInfo();
       dog1.bark();
       dog1.sleep();
       dog1.eat();
       dog1.play();

        System.out.println("---------------------");


        dog2.displayInfo();
        dog2.bark();
        dog2.eat();
        dog2.sleep();
        dog2.play();

        System.out.println("------------------");

        dog3.displayInfo();
        dog3.bark();
        dog3.eat();
        dog3.sleep();
        dog3.play();

        System.out.println("------------------");

        dog4.displayInfo();
        dog4.bark();
        dog4.eat();
        dog4.sleep();
        dog4.play();

        System.out.println("------------------");

        dog5.displayInfo();
        dog5.bark();
        dog5.eat();
        dog5.sleep();
        dog5.play();




    }
}
