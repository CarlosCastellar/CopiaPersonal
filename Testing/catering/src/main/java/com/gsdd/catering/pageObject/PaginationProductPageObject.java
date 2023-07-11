package com.gsdd.catering.pageObject;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@Getter
@DefaultUrl("http://localhost:5173/")
public class PaginationProductPageObject extends PageObject{

    By enterNext = By.xpath("//img[@alt='Next']");
    By enterResetPage = By.xpath("//img[@alt='ResetPage']");

}
