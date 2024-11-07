package Oct_JavaCourse_ATB9X.ex_SingleInheritance1;

public class MainRunnerClass {

    public static void main(String[] args) {

        Testcase1 tc1 = new Testcase1();
        TestCase2 tc2 = new TestCase2();

        tc1.startBrowser();
        tc1.closeBrowser();
        tc1.readExcelFile();

        tc2.startBrowser();
        tc2.closeBrowser();
        tc2.readExcelFile();
    }
}
