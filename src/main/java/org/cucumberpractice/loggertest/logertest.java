package org.cucumberpractice.loggertest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//This class is created just for testing
//Logger for cucumber is added in BaseTest class under setUp() method

public class logertest {
  public static final Logger log = LogManager.getLogger(logertest.class);

  public static void main(String[] args) {


    System.out.println("Classpath: " + System.getProperty("java.class.path"));

    System.setProperty("log4j.configurationFile", "src/main/resources/log4j2.properties" );
    log.info("File loaded successfully");
    log.error("error occurred");
    log.warn("Warning in application");
    log.debug("Debug is started");


  }

  }
