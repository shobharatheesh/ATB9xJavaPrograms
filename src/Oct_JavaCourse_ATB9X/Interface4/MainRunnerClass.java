package Oct_JavaCourse_ATB9X.Interface4;

//one Interface and two class that implements the same interface
public class MainRunnerClass {

    public static void main(String[] args) {

        //Using interface type for Polymorphism

        Animal d = new Dog();    //dynamic disptach
        Animal c = new Cat();   //dynamic disptach

        d.sound();
        c.sound();



    }
}
