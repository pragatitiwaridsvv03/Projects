package pages;

import baseClass.BaseClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class homepageTest extends BaseClass {

    homepage obj;
    public homepageTest()
    {
        super();
    }

    @BeforeClass
    void init()
    {
        obj = new homepage(driver);
        System.out.println("My log file");
    }

    @Test
    void HomePage() throws InterruptedException
    {
        obj.homepages();
        Thread.sleep(1000);
    }
}
