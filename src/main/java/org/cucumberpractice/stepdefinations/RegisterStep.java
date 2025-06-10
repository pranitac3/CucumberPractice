package org.cucumberpractice.stepdefinations;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cucumberpractice.base.BaseTest;
import org.cucumberpractice.data.DataReader;
import org.cucumberpractice.pages.RegisterPage;
import org.junit.Assert;


import java.io.IOException;

public class RegisterStep extends BaseTest {

    RegisterPage registerPage;
    @Before
    public void driver_invoke() throws IOException {
        setUp();
       registerPage = new RegisterPage(driver);
    }

    @Given("user is on Register Page")
    public void verifyTitle() {
        Assert.assertEquals(driver.getTitle(), "Selenium Practice - Register");
    }

    @When("users enters FirstName, LastName, UserName, Password, {int}")
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



}
