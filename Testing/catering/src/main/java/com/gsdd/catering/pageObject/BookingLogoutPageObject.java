package com.gsdd.catering.pageObject;

import lombok.Getter;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@Getter
@DefaultUrl("http://localhost:5173/")
public class BookingLogoutPageObject extends PageObject {

    By searchProduct = By.xpath("(//div[@class='product__image-container'])[1]");
    By enterReserva = By.xpath("//button[contains(text(),'Realizar reserva')]");
    By msjNoRegistrado = By.xpath("//section[@class='login-page']/div/div/div/div[contains(text(),'Es necesario iniciar sesión antes')]");
    //By searchLoginPage = By.xpath("(//a[contains(text(),'Usuario Registrado')])[1]");
    //By acceptTermsLogin = By.id("chkTC");
    //By enterTermsLogin = By.id("continueNoRedirect");
    //By enterRecomendations = By.xpath("//button[@onClick='location.reload()']");
    //By nitText = By.id("vistaLogin:frmLogin:txtNit");
    //By ccText = By.id("vistaLogin:frmLogin:txtUsuario");
    //By passText = By.id("vistaLogin:frmLogin:txtCadena");
    //By ingresarLogin = By.xpath("//input[@name='vistaLogin:frmLogin:_id18']");
    //By diligenciarFormato = By.id("vistaDashboard:frmDashboard:btnDiligenciarPresentar");
    //By formatoIva = By.xpath("//*[@id='mat-tab-content-0-0']/div/div/app-formatos/div/div/div[8]/div/img");


}
