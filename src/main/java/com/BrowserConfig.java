package com;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class BrowserConfig {

    private static final List<String> browserOptions = Arrays.asList(
            "--window-size=1920,1080",
            "--kiosk",
            "--no-sandbox", // Bypass OS security model, MUST BE THE VERY FIRST OPTION
            "--headless",
            "--disable-infobars", // disabling info bars
            "--disable-extensions", // disabling extensions
            "--disable-dev-shm-usage", // overcome limited resource problems);
            "--profile-directory=Default"
    );

    public void setupDriver() {
        WebDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "false");
    }

    public FirefoxDriver geFireFoxWebDriver() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments(browserOptions);
        options.setLogLevel(FirefoxDriverLogLevel.ERROR);
        options.addPreference("general.useragent.override", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:68.0) Gecko/20100101 Firefox/68.0");
        return new FirefoxDriver(options);
    }

    public void handleIncreaseView(FirefoxDriver driver, String url) {
        System.out.println("bat dau view");
        JavascriptExecutor js = driver;
        driver.navigate().to(url);
        js.executeScript("window.scrollBy(0,1000)");
        try {
            TimeUnit.SECONDS.sleep(2L);
            js.executeScript("window.scrollBy(0,-500)");
            TimeUnit.SECONDS.sleep(2L);

            List<WebElement> totalImage = driver.findElementsByClassName("wp-post-image");
            int min = 0;
            int max = (totalImage.size()>0) ? (totalImage.size() - 1 ): 0;

            Random rand = new Random();
            int ranNum = min + rand.nextInt(2 + 1);
            String script = "document.getElementsByClassName('wp-post-image')[" + ranNum + "].click()";
            js.executeScript(script);
            // cuộn chuột từ từ
            for (int i = 0; i < 16; i++) {
                String scrDown = "window.scrollBy(0," + i * 20 + ")";
                js.executeScript(scrDown);
                TimeUnit.SECONDS.sleep( 2L);
            }
            TimeUnit.SECONDS.sleep(2L);
//            for (int i = 0; i < 10; i++) {
//                String scrUp = "window.scrollBy(0," + -i * 50 + ")";
//                js.executeScript(scrUp);
//                TimeUnit.SECONDS.sleep(1L);
//            }
//            TimeUnit.SECONDS.sleep(2L);
            int ranNumber = rand.nextInt(3);
            if(ranNumber == 1){
                int ranNum1 = min + rand.nextInt(2 + 1);
                String script1 = "document.getElementsByClassName('image-container')[" + ranNum1 + "].click()";
                js.executeScript(script1);
                // cuộn chuột từ từ
                for (int i = 0; i < 15; i++) {
                    String scrDown = "window.scrollBy(0," + i * 30 + ")";
                    js.executeScript(scrDown);
                    TimeUnit.SECONDS.sleep((long) 1.5);
                }
                TimeUnit.SECONDS.sleep(2L);
                for (int i = 0; i < 10; i++) {
                    String scrUp = "window.scrollBy(0," + -i * 30 + ")";
                    js.executeScript(scrUp);
                    TimeUnit.SECONDS.sleep(1L);
                }
            }
            TimeUnit.SECONDS.sleep(5L);
            System.out.println("ket thuc view");
        } catch (Exception e) {
//            log.log(Level.INFO, "BrowserConfig >> handleIncreaseView >> Exception", e);
            System.out.println(e);
        }
    }

}
