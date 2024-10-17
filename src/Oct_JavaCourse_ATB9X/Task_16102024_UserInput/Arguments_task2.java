package Oct_JavaCourse_ATB9X.Task_16102024_UserInput;

public class Arguments_task2 {

    public static void main(String[] args) {

        int firstNum = Integer.parseInt(args[1]);
        int secondNum =Integer.parseInt(args[0]);

        int result =(firstNum > secondNum)? firstNum:secondNum;
        System.out.println("The Largest Number : "+result);


        }
    }


