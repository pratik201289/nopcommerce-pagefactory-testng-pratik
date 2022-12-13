package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckoutPage extends Utility {
    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastName;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailId;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement country;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement city;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postCode;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber;
    @CacheLookup
    @FindBy(name = "save")
    WebElement continueButton;
    @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement nextDayButton;
    @CacheLookup
    @FindBy(xpath = "//button[@onclick='ShippingMethod.save()']")
    WebElement clickContinue;

    public void fillMandatoryField() {
        Reporter.log("Enter first name" + firstName.toString());
        Reporter.log("Enter last name" + lastName.toString());
        Reporter.log("Enter email id" + emailId.toString());
        Reporter.log("Select country" + country.toString());
        Reporter.log("Select city" + city.toString());
        Reporter.log("Enter address" + address.toString());
        Reporter.log("Enter postcode" + postCode.toString());
        Reporter.log("Enter phone number" + phoneNumber.toString());
        Reporter.log("Click on continue button" + continueButton.toString());

        sendTextToElement(firstName, "Pratik");
        sendTextToElement(lastName, "Vyas");
        sendTextToElement(emailId, getRandomString(5)+"@gmail.com");
        selectByVisibleTextFromDropDown(country, "United Kingdom");
        sendTextToElement(city, "London");
        sendTextToElement(address, "100, High road");
        sendTextToElement(postCode, "A1 2AB");
        sendTextToElement(phoneNumber, "07171002233");
        clickOnElement(continueButton);
    }

    public void clickOnNextDayAirButton() {
        Reporter.log("Click on next day button" + nextDayButton.toString());
        clickOnElement(nextDayButton);
    }

    public void setClickContinue() {
        Reporter.log("Click on continue" + clickContinue.toString());
        clickOnElement(clickContinue);
    }


}
