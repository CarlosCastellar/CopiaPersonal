package com.gsdd.steps.catering;

import com.gsdd.catering.steps.BookingLogoutPageStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;

public class CateringReserveNoLoginStepDefinition {

    @Steps
    BookingLogoutPageStep cateringStep;

    @Given("User is on main page")
    public void userIsOnMainPage() {
        cateringStep.openBrowser();
    }
    @When("Page loads select product and reserved it")
    public void pageLoadsSelectProductAndReservedIt() throws InterruptedException {
        cateringStep.enterBookingLogout();
    }
    @Then("You has message that you are logout")
    public void youHasMessageThatYouAreLogout() {
        Assertions.assertNotNull(cateringStep.getBookingLogoutPageObject().getDriver()
                .findElement(cateringStep.getBookingLogoutPageObject().getMsjNoRegistrado()));
    }
}
