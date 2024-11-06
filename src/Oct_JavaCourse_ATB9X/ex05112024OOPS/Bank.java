package Oct_JavaCourse_ATB9X.ex05112024OOPS;

public class Bank {

    //attributes

    String name;
    double  accNum;
    double balance;

    //constructor
    Bank(String name , double accNum, double balance)
    {
        this.name = name;
        this.accNum = accNum;
        this.balance = balance;
    }

    //Behaviour

    void Savings()
    {
        System.out.println("This Account with "+name+ " has a savings account and FD account");
    }

    void BankInfo()
    {
        System.out.println("Name : "+name);
        System.out.println("Account number :"+accNum);
        System.out.println("Balance: " +balance+" rs");

    }
}
