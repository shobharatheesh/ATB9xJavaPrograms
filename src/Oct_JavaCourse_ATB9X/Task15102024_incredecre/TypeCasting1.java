package Oct_JavaCourse_ATB9X.Task15102024_incredecre;

public class TypeCasting1 {

    //Implicit Typecasting (Widening)

    public static void main(String[] args) {

        int cents = 1500; //1500 Cents

        double dollars = cents /100.0; //implicit casting from int to double

        System.out.println(" Total amount in dollars : $" + dollars);

    }
}
