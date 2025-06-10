package org.cucumberpractice.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    static WebDriver driver;

    public static WebDriver initDriver()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }
    public static WebDriver getDriver()
    {
        return  driver;
    }
    public static void takeScreenshot()
    {

    }
}
