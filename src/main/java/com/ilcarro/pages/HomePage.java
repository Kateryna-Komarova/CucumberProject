package com.ilcarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "h1")
    WebElement homePageTitle;

    public HomePage isHomePageTitleDisplayed() {
        assert isElementDisplayed(homePageTitle);
        return this;
    }

    @FindBy(xpath = "//a[.=' Log in ']")
    WebElement loginLink;

    public LoginPage clickOnLoginLink() {
        click(loginLink);
        return new LoginPage(driver);
    }

    @FindBy(xpath = "//*[@id='1']")
    WebElement letTheCarWork;

    public LetTheCarWorkPage clickOnLetTheCarWorkLink() {
        click(letTheCarWork);
        return new LetTheCarWorkPage(driver);
    }
}
