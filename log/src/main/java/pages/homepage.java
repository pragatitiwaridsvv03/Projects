package pages;

import baseClass.BaseClass;
import helper.actionHandler;
import helper.log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage extends BaseClass {

    @FindBy(xpath = "//li[@id=\"menu-item-46\"]")
    private WebElement signinbtn;

    WebDriver driver;
    public  homepage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //Go to Sign-in Page
    public void homepages() throws InterruptedException
    {

        try {
            driver.findElement(By.xpath("//span[text()=\"Sign in\"]"));
            log.info("login button found");
        }catch (Exception e){
            log.error("Button not found");
        }

        log.startTestCase("homepahes");
        if(signinbtn != null) {
            Thread.sleep(2000);
            actionHandler.click(signinbtn);
        }else {
            log.error("Unable to click");
        }
        log.endTestCase("homepahes");

    }
}
