package org.cucumberpractice.stepdefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.be.I;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.formula.functions.Index;
import org.cucumberpractice.base.BaseTest;
import org.cucumberpractice.data.DataReader;
import org.cucumberpractice.pages.RegisterPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.io.IOException;
import java.util.List;
import java.util.Map;

public class RegisterStep extends BaseTest {

    RegisterPage registerPage;

    @Before
    public void driver_invoke() throws IOException {
        setUp();
        registerPage = new RegisterPage(driver);
    }

    @After
    public void userClosesBrowser() {
        tearDown();
    }

    @Given("user is on Register Page")
    public void verifyTitle() {
        Assert.assertEquals(driver.getTitle(), "Selenium Practice - Register");
    }

    @When("users enters FirstName, LastName, UserName, Password")
    public void users_enters() throws IOException {
        registerPage.enterFirstName(DataReader.getCellData("Sheet1", 1, 0));
        registerPage.enterLastName(DataReader.getCellData("Sheet1", 1, 1));
        registerPage.enterUserName(DataReader.getCellData("Sheet1", 1, 2));
        registerPage.enterPassword(DataReader.getCellData("Sheet1", 1, 3));

    }

    @When("user clicks on Register")
    public void user_clicks_on() throws InterruptedException {
        registerPage.click();

    }

    @Then("user should register successfully")
    public void user_should_register_successfully() {
        System.out.println("user registered successfully");

    }

    @Given("User clicks on Form Menu")
    public void userClicksOnHomePage() throws InterruptedException {
        registerPage.clickFormMenu();
    }
//----------------------------------------------------------------------------------------------


    @Given("user is on Login Page")
    public void userIsOnLoginPage()
    {
        Assert.assertEquals(driver.getTitle(), "Selenium Practice - Login");
    }

    @When("users enters email {string}")
    public void usersEntersEmail(String Email) {

        registerPage.users_enters_email(Email);
    }

    @When("users enters password {string}")
    public void usersEntersPassword(String Password) {

        registerPage.users_enters_password(Password);
    }

    @Then("user clicks on Login")
    public void loginclick() throws InterruptedException {
        registerPage.loginclick();
    }


    @When("users enters email and password")
    public void usersEntersEmailAndPassword(DataTable table) {
        List<Map<String, String>> data = table.asMaps(String.class, String.class);
        for (Map<String, String> row : data) {
            registerPage.users_enters_email(row.get("Email"));
            registerPage.users_enters_password(row.get("Password"));
            driver.navigate().refresh();
            System.out.println(row.get("Email") + " is " + row.get("Password"));
        }
    }

    @When("users verify table details")
    public void usersVerifyTableDetails(DataTable table)
    {
//        List<Map<String, String>> data = table.asMaps(String.class, String.class);
//        for (Map<String, String> row : data) {
//
//            Assert.assertEquals(row.get("FirstName"), driver.findElement(By.xpath("//tbody/tr[" +row.get("Index") + "]/td[1]")).getText());
//            System.out.println(driver.findElement(By.xpath("//tbody/tr[" +row.get("Index") + "]/td[1]")).getText());
//            Assert.assertEquals(row.get("LastName"), driver.findElement(By.xpath("//tbody/tr[" +row.get("Index") + "]/td[2]")).getText());
//            System.out.println(driver.findElement(By.xpath("//tbody/tr[" +row.get("Index") + "]/td[2]")).getText());
//   }

        List<String> datalist = table.asList();

        for(String temp: datalist)
        {
            System.out.println(temp);
        }

    }


    @When("users verify table data {string}, {string} for {}")
    public void usersVerifyTableData(String FirstName, String LastName, Integer Index) {

        String s1= driver.findElement(By.xpath("//tbody/tr[" +Index +"]/td[1]")).getText();
        System.out.println(s1);


        Assert.assertEquals("The result is not as expected.", FirstName , driver.findElement(By.xpath("//tbody/tr[" +Index +"]/td[1]")).getText());

        Assert.assertEquals("The result is not as expected.", LastName , driver.findElement(By.xpath("//tbody/tr[" +Index +"]/td[2]")).getText());


    }



}
