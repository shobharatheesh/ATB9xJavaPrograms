package Oct_JavaCourse_ATB9X.ex_SingleInheritance1;

public class TestCase2 extends Common_BaseTest{

    public TestCase2()
    {
        System.out.println("DC -Child");

    }

    void testcase2() {
        startBrowser();
        System.out.println("TC2 Executing");
        readExcelFile();
        closeBrowser();
    }


}
