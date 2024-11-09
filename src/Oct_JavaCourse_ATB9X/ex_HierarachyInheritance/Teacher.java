package Oct_JavaCourse_ATB9X.ex_HierarachyInheritance;

public class Teacher extends Person {

    String subject;

    //constructor

    Teacher(String name , int age , String subject)
    {

        super(name, age);
        this.subject = subject;
    }

    //methods or behaviour

    void DisplayInfoTeach()
    {
        displayDetailsPerson();
        System.out.println("Subject: "+subject);
    }
}
