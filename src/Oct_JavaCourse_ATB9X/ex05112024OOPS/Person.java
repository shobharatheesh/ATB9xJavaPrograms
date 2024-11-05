package Oct_JavaCourse_ATB9X.ex05112024OOPS;

public class Person {

    //attributes

    String name;
    int age;

   //constructor

    Person(String name , int age)
    {
        this.name = name;
        this.age = age;
    }


    //behaviour

    void talk()
    {
        System.out.println(name + " can talk ");
    }
    void eat()
    {
        System.out.println(name + " can eat");
    }
    void play()
    {
        System.out.println(name +" can play");
    }
    void run()
    {
        System.out.println(name + " can run");
    }

    void displayInfo()
    {
        System.out.println("Name :" +name);
        System.out.println("age: " +age);
    }
}
