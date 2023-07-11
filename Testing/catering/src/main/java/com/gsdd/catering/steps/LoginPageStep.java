package com.gsdd.catering.steps;

import com.gsdd.catering.pageObject.LoginPageObject;
import lombok.Getter;
import net.thucydides.core.annotations.Step;

@Getter
public class LoginPageStep {

    LoginPageObject loginPageObject = new LoginPageObject();

    @Step
    public void openBrowser() {
        loginPageObject.open();
    }

    @Step
    public void enterlogin() throws InterruptedException {
        loginPageObject.getDriver().findElement(loginPageObject.getEnterLogin()).click();
        loginPageObject.getDriver().findElement(loginPageObject.getInputEmail()).sendKeys("administrador@gmail.com");
        loginPageObject.getDriver().findElement(loginPageObject.getInputPassword()).sendKeys("administrador1234");
        loginPageObject.getDriver().findElement(loginPageObject.getEnterAccept()).click();

    }

}
