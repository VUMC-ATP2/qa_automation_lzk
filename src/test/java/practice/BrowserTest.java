package practice;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserTest {
    ChromeDriver driver;
    @BeforeMethod(alwaysRun = true)
    public void openBrowser(){
        this.driver = new ChromeDriver();
        driver.get("http://google.lv");
    }

    @Test
    public void chromeDriverTest(){
        Assert.assertEquals(driver.getTitle(),"Google");
        driver.getTitle();
        driver.manage().window().maximize();
        //Google
    }
    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
        driver.close();

    }
}
