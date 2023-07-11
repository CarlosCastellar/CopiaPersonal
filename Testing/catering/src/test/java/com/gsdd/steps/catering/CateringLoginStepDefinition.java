package com.gsdd.steps.catering;

import com.gsdd.catering.steps.LoginPageStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;

public class CateringLoginStepDefinition {

    @Steps
    LoginPageStep loginStep;

    @Given("User is login on main page")
    public void userIsLoginOnMainPage() {
        loginStep.openBrowser();
    }
    @When("Page loads and login")
    public void pageLoadsAndLogin() throws InterruptedException {
        loginStep.enterlogin();
    }

    @Then("You are in the main menu of your account")
    public void youAreInTheMainMenuOfYourAccount() {
        Assertions.assertNotNull(loginStep.getLoginPageObject().getDriver()
                .findElement(loginStep.getLoginPageObject().getTextLogin()));
    }
}
