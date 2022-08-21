package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    private WebDriver driver;
    private Waits waits;

    public CartPage(WebDriver driver){
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
    public WebElement getCartQuantityLabel(){
        return driver.findElement(By.className("cart_quantity_label"));
    }

    public WebElement getCartDescLabel(){
        return driver.findElement(By.className("cart_desc_label"));
    }

    public WebElement getContinueShopping(){
        return waits.visibilityOfElement(By.id("continue-shopping"));
    }

    public WebElement getRemove(){
        return waits.visibilityOfElement(By.id("remove-sauce-labs-backpack"));
    }

    public WebElement getCheckout(){
        return waits.visibilityOfElement(By.id("checkout"));
    }

    public WebElement getInventoryItemDesc(){
        return driver.findElement(By.className("inventory_item_desc"));
    }

    public WebElement getCartQuantity(){
        return driver.findElement(By.className("cart_quantity"));
    }

    public WebElement getInventoryItemName(){
        return driver.findElement(By.className("inventory_item_name"));
    }

    //////////
    public WebElement getCheckoutButton() {
        return this.driver.findElement(By.id("checkout"));
    }

}
