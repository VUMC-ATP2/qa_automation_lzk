package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartPage {
    private WebDriver driver;
    public By cartPageTitle = By.className("title");
    public By productInCart = By.className("inventory_item_name");
    public By checkoutButton = By.id("checkout");


    public CartPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public WebElement checkCartPageTitle() {
        return driver.findElement(cartPageTitle);
    }

    public WebElement checkProductInCart() {
        return driver.findElement(productInCart);
    }

    public WebElement getCheckoutButton() {
        return driver.findElement(checkoutButton);
    }

    public void setCheckCartPageTitle(String value) {
        driver.findElement(cartPageTitle).getText();
    }

    public void setProductInCart(String value) {
        driver.findElement(productInCart).getText();
    }

    public void setCheckoutButton() {
        driver.findElement(checkoutButton).click();
    }

}
