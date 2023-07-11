package com.gsdd.utils;

import java.time.Duration;
import lombok.experimental.UtilityClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

@UtilityClass
public final class PageUtils {

  public static WebDriverWait awaitFor(WebDriver driver, int seconds) {
    return new WebDriverWait(driver, Duration.ofSeconds(seconds));
  }

  public static void scrollElement(WebDriver driver, By element) {
    JavascriptExecutor jse = (JavascriptExecutor) driver;
    WebElement webElement = driver.findElement(element);
    jse.executeScript("arguments[0].scrollIntoView()", webElement);
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }

  public static void clickItem(WebDriver driver, By element) {
    scrollElement(driver, element);
    driver.findElement(element).click();
  }

  public static void searchProduct(WebDriver driver, By element, String searchKey) {
    driver.findElement(element).sendKeys(searchKey, Keys.ENTER);
  }
  
  public static void selectVisibleText(WebDriver driver, By element, String text) {
    new Select(driver.findElement(element)).selectByVisibleText(text);
  }

}
