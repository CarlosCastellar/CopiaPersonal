package com.gsdd.catering.steps;

import com.gsdd.catering.pageObject.BookingLogoutPageObject;
import lombok.Getter;
import net.thucydides.core.annotations.Step;

@Getter
public class BookingLogoutPageStep {

    BookingLogoutPageObject bookingLogoutPageObject = new BookingLogoutPageObject();

    @Step
    public void openBrowser() {
        bookingLogoutPageObject.open();
    }

    @Step
    public void enterBookingLogout() throws InterruptedException {
        //dianPageObject.getDriver().findElement(dianPageObject.getSearchLoginPage()).click();
        //dianPageObject.getDriver().wait(5000L);
        //PageUtils.scrollElement(dianPageObject.getDriver(), dianPageObject.getAcceptTermsLogin());
        bookingLogoutPageObject.getDriver().findElement(bookingLogoutPageObject.getSearchProduct()).click();
        bookingLogoutPageObject.getDriver().findElement(bookingLogoutPageObject.getEnterReserva()).click();
        //cateringPageObject.getDriver().findElement(cateringPageObject.getEnterRecomendations()).click();
        //cateringPageObject.getDriver().findElement(cateringPageObject.getNitText()).sendKeys("123456789");
        //cateringPageObject.getDriver().findElement(cateringPageObject.getCcText()).sendKeys("1234567");
        //cateringPageObject.getDriver().findElement(cateringPageObject.getPassText()).sendKeys("12345");

    }

}
