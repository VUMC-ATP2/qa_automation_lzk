package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    private WebDriver driver;
    public By usernameField = By.id("user-name");
    public By passwordField = By.id("password");
    public By loginButton = By.id("login-button");


    public LoginPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsernameField() {
        return driver.findElement(usernameField);
    }

    public WebElement getPasswordField() {
        return driver.findElement(passwordField);
    }

    public WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }

    public void setUsernameField(String value) {
        driver.findElement(usernameField).sendKeys(value);
    }

    public void setPasswordField(String value) {
        driver.findElement(passwordField).sendKeys(value);
    }

    public void setLoginButton() {
        driver.findElement(loginButton).click();
    }
}
