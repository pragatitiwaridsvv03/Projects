package helper;

import baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionHandler extends BaseClass {
    static Actions builder = new Actions(driver);
    public static void click(WebElement element){

        builder.click(element);
    }
    public static void doubleClick(WebElement element){
        builder.doubleClick(element).perform();
    }
    static void moveToElement(WebElement element){
        builder.moveToElement(element).perform();
    }
    public static void rightClick(WebElement element){
        builder.contextClick(element).perform();
    }
    static void rightClick(){
        builder.contextClick().perform();
    }
    static void sendKeys(WebElement element,String value){
        builder.sendKeys(element,value).perform();
    }
    static void sendKeys(String value){
        builder.sendKeys(value).perform();
    }

}