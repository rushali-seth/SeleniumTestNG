package MOSelenium.MOSel;

import MOSelenium.Helper.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExe {
    public static void main(String[] args){
        WebDriver driver = Utility.startBrowser("https://login.yahoo.com/");
        WebElement email = driver.findElement(By.id("login-username"));
        WebElement checkbox = driver.findElement(By.id("persistent"));

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].value=arguments[1]", email,"rudjli@gmail.com");
        js.executeScript("arguments[0].click()", checkbox);
        js.executeScript("document.getElementById('createacc').click()");










    }
}
