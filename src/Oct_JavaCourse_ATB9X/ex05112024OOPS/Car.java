package Oct_JavaCourse_ATB9X.ex05112024OOPS;

public class Car{

    //attributes

    String color;
    String model;
    int year;

    //Constructor

    Car(String color , String model ,int year){

        this.color = color;
        this.model = model;
        this.year = year;
    }

    //Method
    void drive()
    {
        System.out.println("The " +color + " " +model +" is driving");
    }

}

