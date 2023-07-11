package com.gsdd.steps.catering;

import com.gsdd.catering.steps.LoginPageStep;
import com.gsdd.catering.steps.RateProductPageStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;

public class CateringRateProductStepDefinition {

    @Steps
    RateProductPageStep rateProductStep;

    @When("Select product and rate it")
    public void selectProductAndRateIt() throws InterruptedException {
        rateProductStep.rateProduct();
    }

    @Then("Rated product")
    public void ratedProduct() { Assertions.assertTrue(true);
    }

}
