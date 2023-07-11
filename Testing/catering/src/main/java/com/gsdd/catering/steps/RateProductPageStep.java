package com.gsdd.catering.steps;

import com.gsdd.catering.pageObject.BookingLogoutPageObject;
import com.gsdd.catering.pageObject.RateProductPageObject;
import net.thucydides.core.annotations.Step;

public class RateProductPageStep {

    BookingLogoutPageObject bookingLogoutPageObject = new BookingLogoutPageObject();
    RateProductPageObject rateProductPageObject = new RateProductPageObject();

    @Step
    public void openBrowser() {
        rateProductPageObject.open();
    }

    @Step
    public void rateProduct() throws InterruptedException {
        rateProductPageObject.getDriver().findElement(bookingLogoutPageObject.getSearchProduct()).click();
        rateProductPageObject.getDriver().findElement(rateProductPageObject.getEnterRate()).click();
        rateProductPageObject.getDriver().findElement(rateProductPageObject.getEnterRateStars()).click();
        rateProductPageObject.getDriver().findElement(rateProductPageObject.getEnterSendRate()).click();
        rateProductPageObject.getDriver().findElement(rateProductPageObject.getEnterRate()).isEnabled();


    }

}
