package com.controller;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ViewWeb implements Runnable{
    static {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
    }

    public static boolean view(String url) {
        ChromeOptions options = new ChromeOptions();
        options.setHeadless(true);
        WebDriver driver = new ChromeDriver(options);
        String baseUrl = url;
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get(baseUrl);
        js.executeScript("window.scrollBy(0,1000)");
        try {
            TimeUnit.SECONDS.sleep(2L);
            js.executeScript("window.scrollBy(0,-500)");
            TimeUnit.SECONDS.sleep(2L);
            Random rand = new Random();
            int ranNum = rand.nextInt(4)+2;
            String script = "document.getElementsByClassName('wp-post-image')["+ranNum+"].click()";
            js.executeScript(script);
            // cuộn chuột từ từ
            for(int i=0 ; i<15;i++){
                String scrDown = "window.scrollBy(0,"+i*40+")";
                js.executeScript(scrDown);
                TimeUnit.SECONDS.sleep((long) 1.5);
            }
            TimeUnit.SECONDS.sleep(2L);
            for(int i=0 ; i<10;i++){
                String scrUp = "window.scrollBy(0,"+-i*30+")";
                js.executeScript(scrUp);
                TimeUnit.SECONDS.sleep( 1L);
            }
            TimeUnit.SECONDS.sleep(2L);
            // view thêm 1 bài nữa rồi mới thoát
            int ranNum1 = rand.nextInt(4)+2;
            String script1 = "document.getElementsByClassName('wp-post-image')["+ranNum1+"].click()";
            js.executeScript(script1);
            // cuộn chuột từ từ
            for(int i=0 ; i<15;i++){
                String scrDown = "window.scrollBy(0,"+i*30+")";
                js.executeScript(scrDown);
                TimeUnit.SECONDS.sleep((long) 1.5);
            }
            TimeUnit.SECONDS.sleep(2L);
            for(int i=0 ; i<10;i++){
                String scrUp = "window.scrollBy(0,"+-i*30+")";
                js.executeScript(scrUp);
                TimeUnit.SECONDS.sleep( 1L);
            }
            TimeUnit.SECONDS.sleep(5L);
            driver.close();
        } catch (InterruptedException e) {
            driver.close();
            e.printStackTrace();
            return false;
        }
        driver.close();
    return true;
    }

    @Override
    public void run() {
        while (1==1){
            try {
                System.out.println("vào hàm clear cache");
                Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
                Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
                Runtime.getRuntime().exec("taskkill /F /IM conhost.exe");
                TimeUnit.SECONDS.sleep(170L);
            }catch (InterruptedException | IOException e) {
                e.printStackTrace();
            }
        }
    }
}
