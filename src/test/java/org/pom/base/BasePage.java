package org.pom.base;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void load(String endPoint){
        driver.get("https://askomdch.com" + endPoint);
    }

    public void waitForOverLaysToDisappear(By overlay){
        List<WebElement> overlays =  driver.findElements(overlay);
       System.out.println("OVERLAY SIZE" + overlays.size());
       if(overlays.size()>0){
           wait.until(ExpectedConditions.invisibilityOfAllElements(overlays));
       }
       else{
           System.out.println("OVERLAYS INVISIBLE");
           System.out.println("OVERLAYS INVISIBLE");
       }





    }



}
