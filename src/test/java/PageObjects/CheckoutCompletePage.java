package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutCompletePage {

    private WebDriver driver;
    private Waits waits;

    public CheckoutCompletePage(WebDriver driver){
        this.driver = driver;
        waits= new Waits(this.driver);
    }

    public WebElement getBurgerMenu(){
        return waits.visibilityOfElement(By.id("react-burger-menu-btn"));
    }
    public WebElement getInventorySideBarLink(){
        return waits.visibilityOfElement(By.id("inventory_sidebar_link"));
    }
    public WebElement getAboutSideBarLink(){
        return waits.visibilityOfElement(By.id("about_sidebar_link"));
    }
    public WebElement getLogoutSideBarLink(){
        return waits.visibilityOfElement(By.id("logout_sidebar_link"));
    }
    public WebElement getResetSideBarLink(){
        return waits.visibilityOfElement(By.id("reset_sidebar_link"));
    }
    public WebElement getBurgerCrossBtn(){
        return waits.visibilityOfElement(By.id("react-burger-cross-btn"));
    }
    public WebElement getAppLogo(){
        return driver.findElement(By.className("app_logo"));
    }
    public WebElement getShoppingCartLink(){
        return driver.findElement(By.className("shopping_cart_link"));
    }
    public WebElement getShoppingCartBadge(){
        return driver.findElement(By.className("shopping_cart_badge"));
    }

    public WebElement getTitle(){
        return driver.findElement(By.className("title"));
    }

    public WebElement getCompleteHeader(){
        return driver.findElement(By.className("complete-header"));
    }
    public WebElement getCompleteText(){
        return driver.findElement(By.className("complete-text"));
    }
    public WebElement getPonyExpress(){
        return driver.findElement(By.className("pony_express"));
    }

    public WebElement getBtnBackToProducts(){
        return driver.findElement(By.id("back-to-products"));
    }
}
