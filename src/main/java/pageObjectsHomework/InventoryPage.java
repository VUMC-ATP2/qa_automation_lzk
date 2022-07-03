package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InventoryPage {
    private WebDriver driver;
    public By productBackpack = By.id("add-to-cart-sauce-labs-backpack");
    public By cartSection = By.className("shopping_cart_link");


    public InventoryPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public WebElement getProductBackpack() {
        return driver.findElement(productBackpack);
    }

    public WebElement getCartSection() {
        return driver.findElement(cartSection);
    }

    public void setProductBackpack() {
        driver.findElement(productBackpack).click();
    }

    public void setCartSection() {
        driver.findElement(cartSection).click();
    }

}