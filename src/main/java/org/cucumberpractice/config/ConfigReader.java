package org.cucumberpractice.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

     private static Properties prop;

    public static Properties getProperties() throws IOException {
        if (prop == null)
        {
            prop = new Properties();
            FileInputStream fis = new FileInputStream("src/main/resources/config.properties");

            prop.load(fis);
        }

        return prop;
    }



}
