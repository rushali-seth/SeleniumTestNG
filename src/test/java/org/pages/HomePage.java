package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.pom.base.BasePage;

public class HomePage extends BasePage {

    private final By storeMenuLink = By.linkText("Store");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public StorePage navigateToStoreMenuLink(){
    driver.findElement(storeMenuLink).click();
    return new StorePage(driver);
    }

    public HomePage load(){
        load("/");
        return this;
    }


}
