package co.com.despegar.pages;

import co.com.despegar.utils.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

    // page members
    @FindBy(xpath = "//input[ contains(@class, 'sbox-destination')]")
    WebElement destinoTxt;

    @FindBy(xpath = "//input[ contains(@class, 'checkin-date')]")
    WebElement fechaSalidaTxt;

    @FindBy(xpath = "//input[ contains(@class, 'sbox-checkout-date')]")
    WebElement fechaRegresoTxt;

    @FindBy(xpath = "//div[@class ='sbox-button' ]")
    WebElement searchBtn;


    public void validarHomePage() {

    }

    public void goTo() {
        driver.get(Properties.DESPEGAR_URL);
    }

    public boolean isAt() {
        return destinoTxt.isDisplayed() &&
                fechaSalidaTxt.isDisplayed() &&
                fechaRegresoTxt.isDisplayed() &&
                searchBtn.isDisplayed();
    }



    public void buscarHotel(String destination, String fecha_inicial, String fecha_final){
    destinoTxt.sendKeys(destination);
    fechaSalidaTxt.sendKeys(fecha_inicial);
    fechaRegresoTxt.sendKeys(fecha_final);
    searchBtn.click();
    }


    public HomePage(WebDriver homedriver) {
        super(homedriver);
    }
}
