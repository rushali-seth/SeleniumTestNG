package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.pom.base.BasePage;

public class CartPage extends BasePage {

    private final By productName = By.linkText("Blue Shoes");
    private final By checkoutBtn = By.cssSelector(".checkout-button");



    public CartPage(WebDriver driver) {
        super(driver);
    }

    public String getProductName(){

        return wait.until(ExpectedConditions.visibilityOfElementLocated(productName)).getText();
    }

    public CheckoutPage clickCheckoutBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(checkoutBtn)).click();
        return new CheckoutPage(driver);
    }

}
