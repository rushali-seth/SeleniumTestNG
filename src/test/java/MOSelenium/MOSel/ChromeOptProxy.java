package MOSelenium.MOSel;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;

public class ChromeOptProxy {
    public static void main(String[] args) {


        ChromeOptions options = new ChromeOptions();
       // options.setAcceptInsecureCerts(true);
      //  options.addArguments(Arrays.asList("--incognito", "start-maximized", "--headless=new"));
      //  options.addArguments("--incognito", "start-maximized", "--headless=new");

        Proxy p = new Proxy();
        p.setHttpProxy("https://124.24.56:4444");
        options.setCapability("proxy", p);

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://expired.badssl.com/");
        System.out.println(driver.getTitle());






    }
}
