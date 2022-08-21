package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryItemPage {

    private WebDriver driver;
    private Waits waits;

    public InventoryItemPage(WebDriver driver){
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

    public WebElement getBackToProducts(){
        return driver.findElement(By.id("back-to-products"));
    }

    public WebElement getInventoryDetailsImage(){
        return driver.findElement(By.className("inventory_details_img"));
    }

    public WebElement getInventoryDetailsNameLargeSize(){
        return driver.findElement(By.className("inventory_details_name large_size"));
    }

    public WebElement getInventoryDetailsDescLargeSize(){
        return driver.findElement(By.className("inventory_details_desc large_size"));
    }

    public WebElement getInventoryDetailsPrice(){
        return driver.findElement(By.className("inventory_details_price"));
    }

    public WebElement getRemoveSauceLabsBackpack(){
        return waits.visibilityOfElement(By.id("remove-sauce-labs-backpack"));
    }

    public WebElement getAddToCart(){
        return waits.visibilityOfElement(By.id("add-to-cart-sauce-labs-backpack"));
    }
}
