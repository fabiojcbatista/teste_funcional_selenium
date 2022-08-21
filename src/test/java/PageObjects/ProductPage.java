package PageObjects;

import Framework.Browser.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

    private WebDriver driver;
    private Waits waits;

    public ProductPage(WebDriver driver){
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
    public WebElement getPeek(){
        return driver.findElement(By.className("peek"));
    }
    public WebElement getProductSortContainer(){
        return driver.findElement(By.className("product_sort_container"));
    }
    public WebElement getInventoryItemImage(){
        return driver.findElement(By.className("inventory_item_img"));
    }
    public WebElement getInventoryItemName(){
        return driver.findElement(By.className("inventory_item_name"));
    }
    public WebElement getInventoryItemDesc(){
        return driver.findElement(By.className("inventory_item_desc"));
    }
    public WebElement getInventoryItemPrice(){
        return driver.findElement(By.className("inventory_item_price"));
    }
    public WebElement getBtnAddTo(){
        return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    }
    public WebElement getBtnRemove(){
        return driver.findElement(By.id("remove-sauce-labs-backpack"));
    }
}
