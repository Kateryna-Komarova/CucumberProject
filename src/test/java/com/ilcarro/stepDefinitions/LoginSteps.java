package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class LoginSteps {
    @And("User clicks on Login link")
    public void  clicks_on_Login_link(){
        new HomePage(driver).clickOnLoginLink();

    }
    @And("User enter valid data")
    public  void enter_valid_data(){
        new LoginPage(driver).enterData("kokos@gmail.com","Qwerty25KL@");

    }
    @And("User clicks on Yalla button")
    public void  clicks_on_Yalla_button(){
        new LoginPage(driver).clickOnYallaButton();

    }
    @Then("User verifies Success message is displayed")
    public void  verifies_Success_message_is_displayed(){
        new LoginPage(driver).isSuccessTextPresent("Logged in success");
    }
}
