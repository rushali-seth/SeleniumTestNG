package org.java.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BrokenLinks {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.google.co.in/");
        List<WebElement> links = driver.findElements(By.tagName("a"));
        links.addAll(driver.findElements(By.tagName("img")));
        System.out.println("total links are " + links.size());
        List<WebElement> activeLinks = new ArrayList<>();
        for(int i=0;i< links.size(); i++){
           if(links.get(i).getAttribute("href") != null){
               activeLinks.add(links.get(i));
           }
        }
        System.out.println("total active links are " + activeLinks.size());
        for(int j=0;j<activeLinks.size(); j++){
            HttpURLConnection http =  (HttpURLConnection)
                    new URL(activeLinks.get(j).getAttribute("href")).openConnection();
            http.connect();
            System.out.println(activeLinks.get(j).getAttribute("href") + "-> " + http.getResponseMessage());
            http.disconnect();
        }

        driver.quit();
    }

//    public static void verifyLinkResponseCode(String linkURL){
//        try {
//            URL url = new URL(linkURL);
//            HttpURLConnection http = (HttpURLConnection)url.openConnection();
//            http.setConnectTimeout(3000);
//            if(http.getResponseCode()==200){
//                System.out.println(linkURL + " " + http.getResponseMessage());
//            }
//
//
//
//        }
//        catch(Exception e){
//
//        }
//    }
}
