package org.tests;

import io.qameta.allure.*;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pages.CartPage;
import org.pages.CheckoutPage;
import org.pages.HomePage;
import org.pages.StorePage;
import org.pom.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("Buy from askomdch")
public class FirstTest extends BaseTest {


    @Story("Buy blue shoes")
    @Description("this is a TC to run bank transfer")
    @Link("https://example.org")
    @Link(name="allure", type="mylink")
    @TmsLink("12345")
    @Issue("76665")
    @Test (description="guest checkout using direct bank transfers")
    public void guestCheckoutUsingDirectBankTransfer() {
      //  System.setProperty("webdriver.chrome.driver","C:\\Users\\garvt\\SeleniumE2E\\chromedriver.exe");
        // chromedriver path set in system variable so project could be used globally


        StorePage sp = new HomePage(driver).
                load().
                navigateToStoreMenuLink().
                search("Blue");

        Assert.assertEquals(sp.getTitle(), "Search results: “Blue”");
        sp.clickAddToCart("Blue Shoes");
        CartPage cp = sp.clickViewCart();
        Assert.assertEquals( cp.getProductName(), "Blue Shoes");
        CheckoutPage ccp = cp.clickCheckoutBtn();
        ccp.enterFirstName("Rushali").
                enterLastName("Seth").
                enterAddressLineOne("12 MG Ave").
                enterCity("Alaska").
                enterPostalCode("87161").
                enterEmail("abc@def.com").
                placeOrder();
        Assert.assertEquals( ccp.getNotice(),"Thank you. Your order has been received.");





    }

    // @Description("this is login with bank transfer")
  //   @Test(description = "this is login with bank transfer")
    public void LoginAndCheckoutUsingDirectBankTransfer() throws InterruptedException {
        //  System.setProperty("webdriver.chrome.driver","C:\\Users\\garvt\\SeleniumE2E\\chromedriver.exe");
        // chromedriver path set in system variable so project could be used globally

        WebDriver driver = new ChromeDriver();
        driver.get("https://askomdch.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Store")).click();
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("blue");
        driver.findElement(By.cssSelector("button[value='Search']")).click();
        Assert.assertEquals(
                driver.findElement(By.className("woocommerce-products-header")).getText(),
                "Search results: “blue”");

        driver.findElement(By.cssSelector("a[aria-label='Add “Blue Shoes” to your cart']")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("a[title='View cart']")).click();
        Assert.assertEquals(
                driver.findElement(By.linkText("Blue Shoes")).getText(),
                "Blue Shoes"
        );
        driver.findElement(By.cssSelector(".checkout-button")).click();

      


    }


}
