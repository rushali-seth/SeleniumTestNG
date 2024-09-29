package org.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pom.base.BasePage;

import java.time.Duration;

public class CheckoutPage extends BasePage {

    private final By firstNameFld = By.id("billing_first_name");
    private final By lastNameFld = By.id("billing_last_name");
    private final By addressFldOne = By.id("billing_address_1");
    private final By billingCity = By.id("billing_city");
    private final By billingPostalCode = By.id("billing_postcode");
    private final By billingEmailFld = By.id("billing_email");
    private final By placeOrderBtn = By.id("place_order");
    private final By successNotice = By.className("woocommerce-notice");
    private final By overlay = By.cssSelector(".blockUI.blockOverlay");
    private final By countryDropdown = By.id("select2-billing_country-results");
    private final By stateDropdown = By.id("select2-billing_state-results");
    private final By directBnkTrnsfrRB = By.id("payment_method_bacs");



    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
    public CheckoutPage enterFirstName(String firstName){
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameFld));
        e.clear();
        e.sendKeys(firstName);
        return this;
    }

    public CheckoutPage selectCountry(String countryName){
        Select select = new Select(driver.findElement(countryDropdown));
        select.selectByVisibleText(countryName);
        return this;
    }

    public CheckoutPage selectState(String stateName){
        Select select = new Select(driver.findElement(stateDropdown));
        select.selectByVisibleText(stateName);
        return this;
    }
    public CheckoutPage enterLastName(String lastName){
        driver.findElement(lastNameFld).sendKeys(lastName);
        return this;
    }
    public CheckoutPage selectBnkTrnsfr(){
       WebElement e =  wait.until(ExpectedConditions.elementToBeClickable(directBnkTrnsfrRB));
       if(!e.isSelected()){
           e.click();
       }
       return this;
    }
    public CheckoutPage enterAddressLineOne(String addressLineOne){
        driver.findElement(addressFldOne).sendKeys(addressLineOne);
        return this;
    }
    public CheckoutPage enterPostalCode(String postalCode){
        driver.findElement(billingPostalCode).sendKeys(postalCode);
        return this;
    }
    public CheckoutPage enterCity(String city){
        driver.findElement(billingCity).sendKeys(city);
        return this;
    }
    public CheckoutPage enterEmail(String email){
        driver.findElement(billingEmailFld).sendKeys(email);
        return this;
    }
    public CheckoutPage placeOrder(){
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(placeOrderBtn));
        driver.findElement(placeOrderBtn).click();
        return this;
    }
    public String getNotice(){
         WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(successNotice));
         return e.getText();
    }
}
