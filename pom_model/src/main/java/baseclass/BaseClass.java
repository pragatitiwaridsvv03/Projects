package baseclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseClass
{
   public WebDriver driver;
   public Properties pros;

    public  BaseClass()
    {
        try
        {
            pros= new Properties();
            FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/config/config.properties");
            pros.load(fs);
        }
        catch(Exception e)
        {
        }
    }

    @BeforeClass(alwaysRun = true)
    public void setup()
    {
        if(pros.getProperty("browser").equals("chrome"))
        {
            driver = WebDriverManager.chromedriver().create();
            driver.get(pros.getProperty("url"));
        }
    }

    @AfterSuite
    void exit()
    {
        driver.close();
    }
}
