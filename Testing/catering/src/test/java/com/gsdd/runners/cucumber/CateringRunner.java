package com.gsdd.runners.cucumber;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {
                "src/test/resources/features/catering/bookingLogout.feature",
                "src/test/resources/features/catering/login.feature",
                "src/test/resources/features/catering/rateProduct.feature,",
                "src/test/resources/features/catering/paginationProduct.feature"},
        glue = "com/gsdd/steps/catering", snippets = CucumberOptions.SnippetType.CAMELCASE)

public class CateringRunner {
    public static final int WAIT_SEC = 30;
}
