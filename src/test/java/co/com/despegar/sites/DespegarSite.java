package co.com.despegar.sites;

import co.com.despegar.hooks.Hooks;
import co.com.despegar.pages.HomePage;
import co.com.despegar.pages.ResultsPage;
import org.openqa.selenium.WebDriver;

public class DespegarSite {

    private HomePage home;
    private ResultsPage results;
    private WebDriver driver;


    public DespegarSite(WebDriver despegarSiteDriver) {
        this.driver = despegarSiteDriver;
        driver.get("https://www.despegar.com.co/");
    }

    public HomePage home() {
        if (home == null) {
            return new HomePage(driver);
        }
        return home;

    }

    public ResultsPage results(){
        if(results == null){
            return new ResultsPage(driver);
        }
        return results;
    }

    {

    }
}
