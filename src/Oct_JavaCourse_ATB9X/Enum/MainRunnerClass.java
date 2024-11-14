package Oct_JavaCourse_ATB9X.Enum;

public class MainRunnerClass {

    public static void main(String[] args) {

        Day today = Day.Wednesday;

        System.out.println("Today is : "+today);

        //using enum in switch case

        switch(today){
            case Monday:
                System.out.println("Start of the week!");
                break;
            case Friday:
                System.out.println("End of the week!");
                break;
            case Sunday:
                System.out.println("Its a Weekend");
                break;
            default:
                System.out.println("Its a weekday");
        }




    }
}
