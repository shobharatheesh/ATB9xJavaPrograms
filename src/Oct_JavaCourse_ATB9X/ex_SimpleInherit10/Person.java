package Oct_JavaCourse_ATB9X.ex_SimpleInherit10;

public class Person {

    //attributes
    String name;
    int age;

    //Constructor for person class

    Person(String name , int age)
    {
        this.name = name;
        this.age = age;
    }

     void displayPersonInfo()
    {
        System.out.println("Name: "+name+ " ,Age: "+age);
    }


}
