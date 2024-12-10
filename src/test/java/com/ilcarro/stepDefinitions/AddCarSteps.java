package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LetTheCarWorkPage;
import io.cucumber.java.en.And;

import static com.ilcarro.pages.BasePage.driver;

public class AddCarSteps {

    @And("User clicks on LetTheCarWorkLink")
    public void clicks_on_LetTheCarWorkLink() {
        new HomePage(driver).clickOnLetTheCarWorkLink();
    }

    @And("User enter data")
    public void enter_data() {
        new LetTheCarWorkPage(driver).typeAddress()
                .typeManufacture("Lexus")
                .typeModel("LC 500")
                .typeYear("2020")
                .selectFuel("P")
                .typeSeats("4")
                .enterCarClass("1")
                .typeCarRegistrationNumber("15689TZB")
                .addPrice("300")
                .uploadCarPhoto("/Users/kato/QA_Auto")
                .clickSubmitButton();
    }

    @And("User verifies Car added message is displayed")
    public void car_Added_Message() {
        new LetTheCarWorkPage(driver).verifyText("Car added");
    }
}

