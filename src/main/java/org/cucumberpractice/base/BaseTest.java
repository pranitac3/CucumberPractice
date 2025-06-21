package org.cucumberpractice.base;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cucumberpractice.config.ConfigReader;
import org.cucumberpractice.pages.RegisterPage;
import org.cucumberpractice.utilities.DriverFactory;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    public static WebDriver driver;

    public  static Properties baseProp;

    public static final Logger log = LogManager.getLogger(BaseTest.class);

    public  void setUp() throws IOException
    {
        baseProp = ConfigReader.getProperties();
        driver = DriverFactory.initDriver();
        driver.get(baseProp.getProperty("table_url"));

        //System.out.println("Classpath: " + System.getProperty("java.class.path"));

        //System.setProperty("log4j.configurationFile", "src/main/resources/log4j2.properties" );
        log.info("File loaded successfully");
        log.error("error occurred");
        log.warn("Warning in application");
        log.debug("Debug is started");


    }

    public  void tearDown()
    {
        if(driver != null)
        {
            driver.quit();
        }
    }




}
