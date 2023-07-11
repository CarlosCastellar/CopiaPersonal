package com.gsdd.catering.pageObject;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@Getter
@DefaultUrl("http://localhost:5173/")
public class LoginPageObject extends PageObject {

    By enterLogin = By.xpath("//button[contains(text(),'Iniciar Sesión')]");
    By inputEmail = By.xpath("//input[@name='email']");
    By inputPassword = By.xpath("//input[@name='contrasena']");
    By enterAccept = By.xpath("//span[contains(text(),'Ingresar')]");
    By textLogin = By.xpath("//span[contains(text(),'Administrador')]");

}
