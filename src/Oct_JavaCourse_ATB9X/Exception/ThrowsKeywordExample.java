package Oct_JavaCourse_ATB9X.Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsKeywordExample {

    public static void readFile() throws IOException
    {

        FileReader file = new FileReader("nonexsitancefile.txt");
        BufferedReader fileinput = new BufferedReader(file);
        System.out.println(fileinput.readLine());
        fileinput.close();

    }

    public static void main(String[] args) {

        try
        {
            readFile();
        }
        catch(IOException e)
        {
            System.out.println("IOException caught: "+  e.getMessage());
        }
    }
}
