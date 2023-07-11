package com.gsdd.catering.steps;

import com.gsdd.catering.pageObject.LoginPageObject;
import com.gsdd.catering.pageObject.PaginationProductPageObject;
import lombok.Getter;
import net.thucydides.core.annotations.Step;

public class PaginationProductPageStep {

    PaginationProductPageObject paginationProductPageObject = new PaginationProductPageObject();

    @Step
    public void openBrowser() {
            paginationProductPageObject.open();
        }

    @Step
    public void enterPagination() throws InterruptedException {
        paginationProductPageObject.getDriver().findElement(paginationProductPageObject.getEnterNext()).click();
        paginationProductPageObject.getDriver().findElement(paginationProductPageObject.getEnterNext()).click();
        paginationProductPageObject.getDriver().findElement(paginationProductPageObject.getEnterResetPage()).click();
    }
}
