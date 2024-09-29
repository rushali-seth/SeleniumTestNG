package MOSelenium.MOSel;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static java.io.File.*;


public class Mobiles {

    String name, color;
    int price;

    public Mobiles(String name, String color, int price){
        this.name=name;
        this.color=color;
        this.price=price;
    }
public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://askomdch.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));;
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        List<WebElement> elements = driver.findElements(By.xpath("//a[@class='menu-link']"));
        ArrayList<String> al = new ArrayList<>();
        List<String> urls = new ArrayList<>();
        for(int i=0;i<elements.size();i++){
            al.add(elements.get(i).getText());
           urls.add(elements.get(i).getAttribute("href"));

        }
        for(String aa:al){
            System.out.println(aa);
        }
        System.out.println(urls);

       WebElement w =  driver.findElement(By.linkText("Men"));
       System.out.println( w.getText());
       System.out.println(w.getAttribute("href"));
       driver.switchTo().frame(driver.findElement(By.id("")));
       driver.switchTo().defaultContent();

       JavascriptExecutor js = (JavascriptExecutor)driver;
       js.executeScript("window.scrollBy(0,500)");
       js.executeScript("document.getElementById.value='user'");
       String num = "1";
       int a = Integer.parseInt(num);
       String s = String.valueOf(1);
       String c = String.valueOf('c');

       File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       //FileUtils.copyFile(src, new File(""));

      WebDriverWait ww = new WebDriverWait(driver, Duration.ofSeconds(5));
      ww.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("")))).sendKeys("rushali");

      Set<String> windows = driver.getWindowHandles();
      Iterator<String> it = windows.iterator();
      while(it.hasNext()){
          it.next();
      }

      driver.switchTo().newWindow(WindowType.TAB);
      driver.switchTo().newWindow(WindowType.WINDOW);











        driver.quit();


}

    }
