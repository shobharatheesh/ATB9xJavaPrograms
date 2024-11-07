package Oct_JavaCourse_ATB9X.ex_MultiLevel_Inheritance;

public class MainRunnerClass {
    public static void main(String[] args) {

        Child c = new Child();
        c.home();
        c.Extra_Father();
        c.homeFather();

        Father f = new Father();
        f.gf();
        f.Extra_Father();
        f.homeGF();

        GrandFather g = new GrandFather();
        g.homeGF();
        g.gf();
    }

}
