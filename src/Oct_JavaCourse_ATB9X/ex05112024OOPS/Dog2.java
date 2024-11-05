package Oct_JavaCourse_ATB9X.ex05112024OOPS;

public class Dog2 {

    //Attributes

    String name;
    String breed;
    int age;
    String color;
    double weight;

    //constructor

    Dog2(String name , String breed , int age , String color , double weight)
    {
       this.name = name;
       this.breed = breed;
       this.age = age;
       this.color = color;
       this.weight = weight;
    }

    //behaviour

    void bark()
    {
        System.out.println("My dog " +name + " is barking");
    }
    void eat()
    {
        System.out.println("My dog " +name+ " is eating");
    }
    void play()
    {
        System.out.println("My dog " +name + " is Playing");
    }
    void sleep()
    {
        System.out.println("My dog " +name + " is sleeping");
    }

    void displayInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Age : " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Breed: " + breed);
        System.out.println();
    }

}
