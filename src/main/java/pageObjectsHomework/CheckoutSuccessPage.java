package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutSuccessPage {
    private WebDriver driver;

    public By thanksForOrder = By.className("complete-header");

    public By imageSauceLabs = By.className("complete-text");
    public By backHomeButton = By.id("back-to-products");


    public CheckoutSuccessPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public WebElement getThanksForOrder(String value) {
        return driver.findElement(thanksForOrder);
    }

    public WebElement getImageSauceLabs() {
        return driver.findElement(imageSauceLabs);
    }

    public WebElement getBackHomeButton() {
        return driver.findElement(backHomeButton);
    }

    public void setThanksForOrder(String value) {
        driver.findElement(thanksForOrder).getText();
    }

    public void setImageSauceLabs() {
        driver.findElement(imageSauceLabs).isDisplayed();
    }

    public void setBackHomeButton() {
        driver.findElement(backHomeButton).click();
    }
}
