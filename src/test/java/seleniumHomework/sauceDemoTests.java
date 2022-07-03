package seleniumHomework;

import lombok.Getter;
import lombok.extern.log4j.Log4j;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjectsHomework.*;

import java.util.logging.Level;
import java.util.logging.Logger;

@Log4j
@Getter
public class sauceDemoTests {
    public String openBrowser = "https://www.saucedemo.com/";
    ChromeDriver driver;
    pageObjectsHomework.LoginPage loginPage;
    InventoryPage inventoryPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    CheckoutOverviewPage checkoutOverviewPage;
    CheckoutSuccessPage checkoutSuccessPage;


    @BeforeTest
    public void setProperties() {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
    }

    @BeforeMethod(alwaysRun = true)
    public void openBrowser() {
        this.driver = new ChromeDriver();
    }


    @Test
    public void demoTestScenarioOne() {
        driver.get(openBrowser);
        loginPage = new LoginPage(driver);
        loginPage.setUsernameField("standard_user");
        loginPage.setPasswordField("secret_sauce");
        loginPage.setLoginButton();
        String actualUrl = "https://www.saucedemo.com/inventory.html";
        String expectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        inventoryPage = new InventoryPage(driver);
        inventoryPage.setProductBackpack();
        inventoryPage.setCartSection();
        cartPage = new CartPage(driver);
        cartPage.setCheckCartPageTitle("Your Cart");
        cartPage.setProductInCart("Sauce Labs Backpack");
        cartPage.setCheckoutButton();
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.setFirstNameField("Lelde");
        checkoutPage.setLastNameField("Zaķe-Kazaka");
        checkoutPage.setZipCodeField("LV-1111");
        checkoutPage.setContinueButton();
        checkoutOverviewPage = new CheckoutOverviewPage(driver);
        checkoutOverviewPage.setPaymentInformation("Payment Information:");
        checkoutOverviewPage.setShippingInformation("Shipping Information:");
        checkoutOverviewPage.setItemTotal("Item total: $");
        checkoutOverviewPage.setFinishButton();
        checkoutSuccessPage = new CheckoutSuccessPage(driver);
        checkoutSuccessPage.setThanksForOrder("THANK YOU FOR YOUR ORDER");
        checkoutSuccessPage.setImageSauceLabs();
        checkoutSuccessPage.setBackHomeButton();
    }

    @Test
    public void demoTestScenarioTwo() {
        driver.get(openBrowser);
        loginPage = new LoginPage(driver);
        loginPage.setUsernameField("standard_user");
        loginPage.setPasswordField("secret_sauce");
        loginPage.setLoginButton();
        inventoryPage = new InventoryPage(driver);
        inventoryPage.setCartSection();
        cartPage = new CartPage(driver);
        cartPage.setCheckoutButton();
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.setContinueButton();
        checkoutPage.setFirstNameError("Error: First Name is required");
        checkoutPage.setFirstNameField("Lelde");
        checkoutPage.setContinueButton();
        checkoutPage.setLastNameError("Error: Last Name is required");
        checkoutPage.setLastNameField("Zaķe-Kazaka");
        checkoutPage.setContinueButton();
        checkoutPage.setZipCodeError("Error: Postal Code is required");
        checkoutPage.setZipCodeField("LV-1111");
        checkoutPage.setContinueButton();


    }


    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        driver.close();
        driver.quit();
    }

}
