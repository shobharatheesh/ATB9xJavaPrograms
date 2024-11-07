package Oct_JavaCourse_ATB9X.ex_MultipleInheritance;

public class MainRunnerClass {

    public static void main(String[] args) {

        Child1 ch1 = new Child1();
        Child2 ch2 = new Child2();

        ch1.homeFather();
        ch1.homeChild();
        ch1.moneyChild();
        ch1.moneyFather();
        ch1.carFather();

        ch2.homeMother();
        ch2.moneyMother();
        ch2.home();




    }
}
