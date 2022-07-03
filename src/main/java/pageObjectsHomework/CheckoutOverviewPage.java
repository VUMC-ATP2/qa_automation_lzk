package pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutOverviewPage {
    private WebDriver driver;
    public By paymentInformation = By.className("summary_info_label");
    public By shippingInformation = By.className("summary_info_label");
    public By itemTotal = By.className("summary_subtotal_label");
    public By finishButton = By.id("finish");


    public CheckoutOverviewPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public WebElement getPaymentInformation() {
        return driver.findElement(paymentInformation);
    }

    public WebElement getShippingInformation() {
        return driver.findElement(shippingInformation);
    }

    public WebElement getItemTotal() {
        return driver.findElement(itemTotal);
    }

    public WebElement getFinishButton() {
        return driver.findElement(finishButton);
    }

    public void setPaymentInformation(String value) {
        driver.findElement(paymentInformation).getText();
    }

    public void setShippingInformation(String value) {
        driver.findElement(shippingInformation).getText();
    }

    public void setItemTotal(String value) {
        driver.findElement(itemTotal).getText();
    }

    public void setFinishButton() {
        driver.findElement(finishButton).click();
    }
}

