package Oct_JavaCourse_ATB9X.ex_SingleInheritance1;

public class Testcase1 extends Common_BaseTest {

    public Testcase1()
    {
        System.out.println("DC - child");
    }

    public  void testcase()
    {
        startBrowser();
        readExcelFile();
        closeBrowser();

    }
}
