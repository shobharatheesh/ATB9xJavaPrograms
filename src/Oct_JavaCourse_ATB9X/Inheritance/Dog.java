package Oct_JavaCourse_ATB9X.Inheritance;

public class Dog extends Animal{

    /**
     *
     */
    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Bark");
    }
}
