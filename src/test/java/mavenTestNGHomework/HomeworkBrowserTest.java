package mavenTestNGHomework;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomeworkBrowserTest {
    ChromeDriver browser;
    ChromeDriver browserTwo;
    @BeforeMethod(alwaysRun = true)
    public void openBrowser(){
        this.browser = new ChromeDriver ();
        browser.get("https://edition.cnn.com/");

    }
    @Test
    public void chromeDriverTest() {
        Assert.assertEquals(browser.getTitle(), "CNN International - Breaking News, US News, World News and Video");
        browser.getTitle();}


    @AfterMethod(alwaysRun = true)
    public void closeBrowser(){
        browser.close();
    }

    @BeforeMethod(alwaysRun = true)
    public void openBrowserTwo(){
        this.browserTwo = new ChromeDriver();
        browserTwo.get("http://delfi.lv");

    }
    @Test
    public void chromeDriverTestTwo(){
        Assert.assertEquals(browserTwo.getTitle(),"DELFI - Vadošais ziņu portāls Latvijā - DELFI");
        browserTwo.getTitle();
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowserTwo(){
        browserTwo.close();
    }


}
