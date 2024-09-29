package org.pom.factory;

import org.constants.DriverTYpe;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverManager {

    public WebDriver initializeDriver(){
        String browser = System.getProperty("browser", "CHROME");
        WebDriver driver;
        switch(DriverTYpe.valueOf(browser)){
            case CHROME :
                driver = new ChromeDriver();
                break;
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalStateException("Invalid browser name: " + browser);
        }
        //WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
      //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        return driver;
    }




}
