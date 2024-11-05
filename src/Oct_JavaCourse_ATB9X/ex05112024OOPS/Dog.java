package Oct_JavaCourse_ATB9X.ex05112024OOPS;

public class Dog {

    //attributes
     String name;
     String color;
     String breed;

     //Constructor
     Dog(String name , String color , String breed)
    {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }
     //methods
    void pet(){
        System.out.println("My dog " + name +" with "+color +" is a cutest pet animal" );
    }

}
