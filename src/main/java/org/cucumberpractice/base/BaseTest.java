package org.cucumberpractice.base;

import org.cucumberpractice.config.ConfigReader;
import org.cucumberpractice.utilities.DriverFactory;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    public static WebDriver driver;

    public  static Properties baseProp;

    public  void setUp() throws IOException
    {
        baseProp = ConfigReader.getProperties();
        driver = DriverFactory.initDriver();
        driver.get(baseProp.getProperty("url"));
    }

    public  void tearDown()
    {
        if(driver != null)
        {
            driver.quit();
        }
    }




}
