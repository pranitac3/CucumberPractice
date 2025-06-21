package org.cucumberpractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class RegisterPage {


    WebDriver driver;

    Properties objectprop;

    public RegisterPage(WebDriver driver) throws IOException {
        this.driver = driver;

        objectprop = new Properties();
        FileInputStream fis = new FileInputStream("src/main/resources/objectRepository.properties");

        objectprop.load(fis);


    }

    public void enterFirstName(String firstname) {
        driver.findElement(By.xpath(objectprop.getProperty("register.firstname"))).sendKeys(firstname);
    }

    public void enterLastName(String lastname) {
        driver.findElement(By.xpath(objectprop.getProperty("register.lastname"))).sendKeys(lastname);
    }

    public void enterUserName(String username) {
        driver.findElement(By.xpath(objectprop.getProperty("register.username"))).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(By.xpath(objectprop.getProperty("register.password"))).sendKeys(password);
    }

    public void click() throws InterruptedException {
        driver.findElement(By.xpath(objectprop.getProperty("register.submit"))).click();
        Thread.sleep(10000);
    }

    public void clickFormMenu() throws InterruptedException {
        driver.findElement(By.xpath(objectprop.getProperty("menu.form"))).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath((objectprop.getProperty("menu.form.login")))).click();
        System.out.println("Login page launched successfully.");
    }
    //-------------------------------------------------

    public void users_enters_email(String email1) {
        driver.findElement(By.xpath(objectprop.getProperty("login.email"))).sendKeys(email1);
    }

    public void users_enters_password(String password1) {
        driver.findElement(By.xpath(objectprop.getProperty("login.password"))).sendKeys(password1);
    }

    public void loginclick() throws InterruptedException {
        driver.findElement(By.xpath(objectprop.getProperty("login.submit"))).click();
        Thread.sleep(10000);
    }


}
