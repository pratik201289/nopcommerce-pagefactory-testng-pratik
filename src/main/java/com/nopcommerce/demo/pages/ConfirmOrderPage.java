package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ConfirmOrderPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement creditCardText;
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]")
    WebElement nextDayAirText;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirm;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankYouText;
    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement successfullyMessage;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButtonClick;


    public String getCreditCardText() {
        Reporter.log("Get credit card text" + creditCardText.toString());
        return getTextFromElement(creditCardText);
    }

    public String getNextDayAirText() {
        Reporter.log("Get next day air text" + nextDayAirText.toString());
        return getTextFromElement(nextDayAirText);
    }

    public void clickOnConfirmButton() {
        Reporter.log("Click on confirm button" + confirm.toString());
        clickOnElement(confirm);
    }

    public String getThankYouText() {
        Reporter.log("Get thank you text" + thankYouText.toString());
        return getTextFromElement(thankYouText);
    }

    public String getSuccessfullyMessage() {
        Reporter.log("Get success message" + successfullyMessage.toString());
        return getTextFromElement(successfullyMessage);
    }

    public void setContinueButtonClick() {
        Reporter.log("Click on continue button" + continueButtonClick.toString());
        clickOnElement(continueButtonClick);
    }

}
