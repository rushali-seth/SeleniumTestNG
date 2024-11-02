package MOSelenium.MOSel;

import MOSelenium.Helper.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class E2ECourse {
    public static void main(String[] args){

        WebDriver driver = Utility.startBrowser("https://freelance-learn-automation.vercel.app/login");
        driver.findElement(By.id("email1")).sendKeys(" admin@email.com");
        driver.findElement(By.id("password1")).sendKeys("admin@123");
        driver.findElement(By.className("submit-btn")).click();

        WebElement hoverElement = driver.findElement(By.xpath("//span[text()='Manage']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverElement).perform();
        driver.findElement(By.linkText("Manage Courses")).click();
        driver.findElement(By.xpath("//button[text()='Add New Course ']")).click();
        driver.findElement(By.id("thumbnail")).sendKeys("C://Users//garvt//Downloads//image.png");
        driver.findElement(By.cssSelector("input#name")).sendKeys("Selenium With Python");
        driver.findElement(By.cssSelector("textarea#description")).sendKeys("Selenium With Python");
        driver.findElement(By.id("instructorNameId")).sendKeys("Mukesh Otwani");
        driver.findElement(By.id("price")).clear();
        driver.findElement(By.id("price")).sendKeys("2000");
        driver.findElement(By.xpath("//input[@name='startDate']")).clear();
        driver.findElement(By.xpath("//input[@name='startDate']")).sendKeys("11/20/2024");
        driver.findElement(By.xpath("//input[@name='endDate']")).clear();
        driver.findElement(By.xpath("//input[@name='endDate']")).sendKeys("12/30/2024");
        driver.findElement(By.xpath("//div[text()='Select Category']")).click();
        driver.findElement(By.xpath("//button[text()='Selenium']")).click();
        driver.findElement(By.xpath("//button[text()='Save']")).click();

        By wb = By.xpath("//span[text()='Selenium']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(wb));

        Assert.assertEquals(driver.findElement(wb).getText(), "Selenium");
        By delete = By.cssSelector(".delete-btn");
        driver.findElement(delete).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(delete));
        Assert.assertFalse(driver.findElement(delete).isDisplayed());
        driver.findElement(By.xpath("//img[@alt='menu']")).click();
        driver.findElement(By.xpath("//button[text()='Sign out']")).click();



    }
}
