package com.gsdd.catering.pageObject;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@Getter
@DefaultUrl("http://localhost:5173/")
public class RateProductPageObject extends PageObject{

    By enterRate = By.xpath("//button[contains(text(),'Calificar')]");
    By enterRateStars = By.xpath("(//span[@style='cursor: pointer;'])[6]");
    By enterSendRate = By.xpath("//button[contains(text(),'Enviar puntuación')]");

}
