package CaseDefinitions;

import Pages.HomePage;
import Pages.Registration;
import Utility.driverUtility;
import Utility.alertUtility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisStepDef extends driverUtility {

    HomePage homePage;
    Registration registration;

    @Given("User is on demoblaze homepage")
    public void userIsOnDemoblazeHomepage() {
        homePage = new HomePage(driver);
        homePage.gotoPage();

    }

    @And("user has click on SignUp button")
    public void userHasClickOnSignUpButton() {
        homePage.getSignUP();
    }

    @And("Register modal is shown")
    public void registerModalIsShown() {
        homePage.regisModal();
    }

    @When("user fill username and password field with {string}")
    public void userFillUsernameAndPasswordFieldWith(String account) {
        registration = new Registration(driver);
        registration.enterUsername(account);
        registration.enterPassword(account);
    }

    @And("user submit registration form")
    public void userSubmitRegistrationForm() {
        registration.submitRegis();
    }

    @Then("user can see successfull registration message")
    public void userCanSeeSuccessfullRegistrationMessage() {
        alertUtility AlertMessage = new alertUtility(driver);
        AlertMessage.successRegistration();
    }

    @When("user fill username and password field with existing account")
    public void userFillUsernameAndPasswordFieldWithExistingAccount() {
        registration = new Registration(driver);
        registration.enterExistingUsername();
    }

    @Then("user will see a popup message")
    public void userWillSeeAPopupMessage() {
        alertUtility AlertMessage = new alertUtility(driver);
        AlertMessage.existingAccountAlert();
    }
}
