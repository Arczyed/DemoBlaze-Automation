package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class Login {

    WebDriver driver;
    private WebDriverWait wait;
    HomePage homePage;

    //Locators for login
    By UName = By.id("loginusername");
    By Upassword = By.id("loginpassword");
    By getLoginButton = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");

    public Login(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void enterUsername(String username){
        driver.findElement(UName).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(Upassword).sendKeys(password);
    }

    public void setLoginButton(){
        driver.findElement(getLoginButton).click();

    }


}
