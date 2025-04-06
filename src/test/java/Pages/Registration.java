package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Registration {

    WebDriver driver;
    private WebDriverWait wait;
    //Locators
    By userInputUsername = By.id("sign-username");
    By userInputPassword = By.id("sign-password");
    By registerSubmitButton = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");

    //Constructor
    public Registration(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void enterUsername(String account){
        driver.findElement(userInputUsername).sendKeys(account);
    }

    public void enterPassword(String account){
        driver.findElement(userInputPassword).sendKeys(account);
    }

    public void submitRegis(){
        driver.findElement(registerSubmitButton).click();
        this.wait.until(ExpectedConditions.alertIsPresent());
    }

    public void enterExistingUsername(){
        driver.findElement(userInputUsername).sendKeys("DemoAccount15");
        driver.findElement((userInputPassword)).sendKeys("DemoAccount15");
    }


}
