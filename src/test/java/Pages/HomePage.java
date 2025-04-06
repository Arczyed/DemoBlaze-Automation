package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage {

    WebDriver driver;
    private WebDriverWait wait;

    //Locators
    By signupbutton = By.id("signin2");
    By signupModal = By.id("signInModal");
    By loginButton = By.id("login2");
    By loginModal =  By.id("logInModal");
    By userValidLogin = By.id("nameofuser");

    public HomePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void gotoPage(){
        driver.get("https://www.demoblaze.com");
    }
    public void getSignUP(){
        driver.findElement(signupbutton).click();
    }

    public void regisModal(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(signupModal));
    }

    public void getLogin(){
        driver.findElement(loginButton).click();
    }

    public void getLoginModal(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(loginModal));
    }

    public boolean validateUserLogin(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(userValidLogin));
        WebElement LoginValidation = driver.findElement(userValidLogin);
        return LoginValidation.isDisplayed();

    }
}

