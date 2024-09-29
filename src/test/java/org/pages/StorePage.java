package org.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.pom.base.BasePage;

public class StorePage extends BasePage {

    private final By searchFld = By.xpath("//input[@type='search']");
    private final By searchBtn = By.cssSelector("button[value='Search']");
    private final By title = By.className("woocommerce-products-header");
    private final By addToCart = By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']");
    private final By viewCartLink = By.linkText("View cart");


    public StorePage(WebDriver driver) {
        super(driver);
    }

    private StorePage enterTextInSearchFld(String txt){
        driver.findElement(searchFld).sendKeys(txt);
        return this;
    }

    private StorePage clickSearchBtn(){
        driver.findElement(searchBtn).click();
        return this;
    }

    public StorePage search(String txt){
        enterTextInSearchFld(txt).clickSearchBtn();
        return this;
    }

    public String getTitle(){
        return driver.findElement(title).getText();

    }

    private By getAddToCartBtnElement(String productName){
        return By.cssSelector("a[aria-label='Add “" + productName +    "” to your cart']");
    }


    public StorePage clickAddToCart(String productName){
        By addToCartBtn = getAddToCartBtnElement(productName);
        driver.findElement(addToCart).click();
        return this;
    }

    public CartPage clickViewCart(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(viewCartLink)).click();
        return new CartPage(driver);
    }


}
