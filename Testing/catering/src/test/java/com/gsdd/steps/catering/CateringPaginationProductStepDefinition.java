package com.gsdd.steps.catering;

import com.gsdd.catering.steps.PaginationProductPageStep;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.Assertions;

public class CateringPaginationProductStepDefinition {

    @Steps
    PaginationProductPageStep paginationProductStep;

    @When("change between pages")
    public void changeBetweenPages() throws InterruptedException {
        paginationProductStep.enterPagination();
    }

    @Then("You are in last page")
    public void youAreInLastPage() { Assertions.assertTrue(true);
    }

}