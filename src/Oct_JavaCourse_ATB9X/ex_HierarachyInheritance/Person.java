package Oct_JavaCourse_ATB9X.ex_HierarachyInheritance;

public class Person {

    //attributes

    String name;
    int age;

    //constructor for person class
    Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    //behaviour or Method to display details

    public void displayDetailsPerson()
    {
        System.out.println("Name: "+name+ " Age: " +age);
    }
}
