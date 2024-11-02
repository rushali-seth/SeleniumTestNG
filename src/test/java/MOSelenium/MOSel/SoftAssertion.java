package MOSelenium.MOSel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Arrays;
import java.util.List;

public class SoftAssertion {

    WebDriver driver;

    @Test
    public void softAssertDemo(){
        SoftAssert sa = new SoftAssert();
        sa.assertEquals("Mukesh", "mukesh");
        sa.assertEquals(12, 13);
        sa.assertEquals(12.2, 22.4);
        sa.assertFalse(true);
        sa.assertTrue(true);
        sa.assertTrue(false);
        System.out.println("end");
        sa.assertAll();

    }

    @Test
    public void method1(){
        int a = 10;
        int b = 11;
        System.out.println("Start");
        Assert.assertEquals(a, b, "int type not equal"); // pass message in case assertion fails
        System.out.println("End");
    }

    @Test
    public void method2(){
        List<String> n = Arrays.asList("Mahesh", "Suresh");
        List<String> m = Arrays.asList("Mahesh", "Suresh", "Rakesh");
        Assert.assertNotEquals(n,m,"validation failed");
        String str = "Rushali Seth";
        Assert.assertTrue(str.contains("Rushali"), "validation failed");
        Assert.assertFalse(str.contains("rushali"), "validation failed");

    }

    @Test(invocationCount=1)
    public void method3(){
        driver = new ChromeDriver();
        driver.get("https://google.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("google"), "validation failed");
    }

}
