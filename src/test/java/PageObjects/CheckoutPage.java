package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.nio.file.FileStore;

public class CheckoutPage {

    private WebDriver driver;
    private Waits waits;

    public CheckoutPage(WebDriver driver){
        this.driver = driver;
        waits= new Waits(this.driver);
    }
    public WebElement getFirstNameTextField(){
        return driver.findElement(By.id("first-name"));
    }
    public WebElement getLastNameTextField(){return driver.findElement(By.id("last-name"));}
    public WebElement getZipTextField(){
        return driver.findElement(By.id("postal-code"));
    }
    public WebElement getBtnCancel(){
        return driver.findElement(By.id("cancel"));
    }
    public WebElement getContinueButton(){
        return driver.findElement(By.id("continue"));
    }
    public WebElement getFinishButton(){
        return driver.findElement(By.id("finish"));
    }
}