package baseClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseClass {

    public static WebDriver driver;

    public Properties pros;

    public BaseClass()
    {
        try
        {
            pros = new Properties();
            FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/config/config.properties");
            pros.load(fs);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    @BeforeSuite
    public void setup()
    {
        DOMConfigurator.configure("log4j.xml");
        if(pros.getProperty("browser").equals("chrome"))
        {
            driver = WebDriverManager.chromedriver().create();
            driver.get(pros.getProperty("url"));
            driver.manage().window().maximize();
        }
    }

    @AfterSuite
    public void exit()
    {
        driver.close();
    }
}
