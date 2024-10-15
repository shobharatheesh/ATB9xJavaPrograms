package Oct_JavaCourse_ATB9X.Task15102024;

public class TypeCasting2 {

    // Explicit typecasting (Narrowing)
    public static void main(String[] args) {

        double temperature = 37.6; //Temperature from a sensor
        int displayTemp =(int) temperature; //explicit casting from double to int.

        System.out.println("Temperature displayed on screen: " + displayTemp + "C");


    }
}
