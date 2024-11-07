package Oct_JavaCourse_ATB9X.ex_SingleInheritance2;

public class MainRunnerClass {

    public static void main(String[] args) {

        Son s = new Son("Tesla",1000000);
        Father f = new Father();
        System.out.println(s.gold);
        s.home2bhk();
        s.home3bhk();
        System.out.println(s.car);
        System.out.println(s.money);



    }
}
