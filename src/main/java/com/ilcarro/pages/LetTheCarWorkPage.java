package com.ilcarro.pages;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LetTheCarWorkPage extends BasePage {
    public LetTheCarWorkPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "pickUpPlace")
    WebElement address;

    public LetTheCarWorkPage typeAddress() {
        address.sendKeys("145 Hayarkon Street 63453 Tel Aviv");
        pause(1000);
        address.sendKeys(Keys.ARROW_DOWN);
        pause(1000);
        address.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(id = "make")
    WebElement make;

    public LetTheCarWorkPage typeManufacture(String manufacture) {
        type(make, manufacture);
        return this;

    }

    @FindBy(id = "model")
    WebElement modelType;

    public LetTheCarWorkPage typeModel(String model) {
        type(modelType, model);
        return this;
    }

    @FindBy(id = "year")
    WebElement carYear;

    public LetTheCarWorkPage typeYear(String year) {
        type(carYear, year);
        return this;
    }

    @FindBy(id = "fuel")
    WebElement carFuel;

    public LetTheCarWorkPage selectFuel(String fuel) {
        carFuel.sendKeys(fuel);
        carFuel.sendKeys(Keys.ENTER);
        return this;
    }

    @FindBy(id = "seats")
    WebElement carSeats;

    public LetTheCarWorkPage typeSeats(String seats) {
        type(carSeats, seats);
        return this;

    }

    @FindBy(id = "class")
    WebElement classOfTheCar;

    public LetTheCarWorkPage enterCarClass(String carClass) {
        type(classOfTheCar, carClass);
        return this;
    }

    @FindBy(id = "serialNumber")
    WebElement serialNumber;

    public LetTheCarWorkPage typeCarRegistrationNumber(String number) {
        type(serialNumber, number);
        return this;
    }

    @FindBy(id = "price")
    WebElement carPrice;

    public LetTheCarWorkPage addPrice(String price) {
        type(carPrice, price);
        return this;
    }

    @FindBy(id = "photos")
    WebElement photos;

    public LetTheCarWorkPage uploadCarPhoto(String path) {
        photos.sendKeys(path);
        return this;
    }

    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    WebElement submit;

    public LetTheCarWorkPage clickSubmitButton() {
        click(submit);
        return this;
    }

    @FindBy(xpath = "//h1[contains(text(),'Car added')]")
    WebElement message;

    public LetTheCarWorkPage verifyText(String text) {
        assert (shouldHaveText(message, "Car added", 5));
        return this;
    }
}
