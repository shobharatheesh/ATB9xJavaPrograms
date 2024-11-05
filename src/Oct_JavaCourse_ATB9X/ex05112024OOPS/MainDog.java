package Oct_JavaCourse_ATB9X.ex05112024OOPS;

public class MainDog {

    public static void main(String[] args) {

        Dog myDog =  new Dog(" Pinku" , "Brown", "aaa");

        //access attributes

        System.out.println("My cutest " + myDog.name +" dog is "+ myDog.color +" color");

        //access method

        myDog.pet();
    }
}
