package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//ul[1]/li/a[text()='Computers ']")
    WebElement computerMenu;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeToStoreText;


    public void clickOnComputerMenu() {
        Reporter.log("Click on computer menu" + computerMenu.toString());
        clickOnElement(computerMenu);
    }

    public String getWelcomeToStoreText() {
        Reporter.log("Get welcome to store text" + welcomeToStoreText.toString());
        return getTextFromElement(welcomeToStoreText);
    }

}
