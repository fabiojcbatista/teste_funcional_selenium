package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    private Waits waits;

    public HomePage(WebDriver driver){
        this.driver = driver;
        waits= new Waits(this.driver);
    }

    public WebElement getUserNameTextField(){
          return waits.visibilityOfElement(By.id("user-name"));
    }

    public WebElement getPasswordTextField(){
         return driver.findElement(By.id("password"));
    }

    public WebElement getLoginButton(){
             return driver.findElement(By.id("login-button"));
    }
}
