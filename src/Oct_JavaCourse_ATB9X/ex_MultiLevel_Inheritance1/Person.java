package Oct_JavaCourse_ATB9X.ex_MultiLevel_Inheritance1;

public class Person {
    //attributes

    String  name;
    int age;

    //constructor  for Person class

    Person(String name,int age){

        this.name = name;
        this.age = age;
    }

    //Method to display person details
     public void displayInfo()
     {
         System.out.println("Name: "+name);
         System.out.println("Age: "+age);
     }
}
