package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutPage {
    private WebDriver driver;
    public By firstNameField = By.id("first-name");
    public By lastNameField = By.id("last-name");
    public By zipCodeField = By.id("postal-code");
    public By continueButton = By.id("continue");
    public By firstNameError = By.className("error-button");
    public By lastNameError = By.className("error-button");
    public By zipCodeError = By.className("error-button");


    public CheckoutPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public WebElement getFirstNameField() {
        return driver.findElement(firstNameField);
    }

    public WebElement getLastNameField() {
        return driver.findElement(lastNameField);
    }

    public WebElement getZipCodeField() {
        return driver.findElement(zipCodeField);
    }

    public WebElement getContinueButton() {
        return driver.findElement(continueButton);
    }

    public WebElement getFirstNameError() {
        return driver.findElement(firstNameError);
    }

    public WebElement getLastNameError() {
        return driver.findElement(lastNameError);
    }

    public WebElement getZipCodeError() {
        return driver.findElement(zipCodeError);
    }

    public void setFirstNameField(String value) {
        driver.findElement(firstNameField).sendKeys(value);
    }

    public void setLastNameField(String value) {
        driver.findElement(lastNameField).sendKeys(value);
    }

    public void setZipCodeField(String value) {
        driver.findElement(zipCodeField).sendKeys(value);
    }

    public void setContinueButton() {
        driver.findElement(continueButton).click();
    }

    public void setFirstNameError(String value) {
        driver.findElement(firstNameError).getText();
    }

    public void setLastNameError(String value) {
        driver.findElement(lastNameError).getText();
    }

    public void setZipCodeError(String value) {
        driver.findElement(zipCodeError).getText();
    }

}
