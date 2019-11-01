package co.com.despegar.hooks;

import co.com.despegar.sites.DespegarSite;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hooks {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public DespegarSite despegarSite;

    @Before
    public void SetUp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        despegarSite = new DespegarSite(driver);
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
