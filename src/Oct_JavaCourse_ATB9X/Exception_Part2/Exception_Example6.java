package Oct_JavaCourse_ATB9X.Exception_Part2;

import java.io.FileReader;
import java.io.IOException;

public class Exception_Example6 {

    //Throwing exception using throws
    public static void readFile() throws IOException{

        FileReader file = new FileReader("nosexitent .txt");
    }

    public static void main(String[] args) {

        try{
            readFile();
        }
        catch(IOException e)
        {
            System.out.println("IOEXception caught: "+e.getMessage());
        }

    }
}
