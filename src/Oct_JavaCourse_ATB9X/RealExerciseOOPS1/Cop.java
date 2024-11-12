package Oct_JavaCourse_ATB9X.RealExerciseOOPS1;

public class Cop {

    private int gun;               //private field
    public String icard;           //public field

    public Cop(int gun)   //paramaeterized constructor
    {
        this.gun = gun;
    }

    protected void canIShoot()   //protected method
    {
        System.out.println("Yes , you can shoot");
    }


}
