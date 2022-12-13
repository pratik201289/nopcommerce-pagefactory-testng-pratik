package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ElectronicsMenu extends Utility {

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/a[1]")
    WebElement mouseHoverElectronic;

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement clickOnCellphone;

    //By clickOnCellphone = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]");
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement verifyActualTextCellPhone;
    // By verifyActualTextCellPhone=By.xpath("//h1[contains(text(),'Cell phones')]");

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listViewTab;

    // By listViewTab = By.xpath("//a[contains(text(),'List')]");
    @CacheLookup
    @FindBy(xpath = "//div[3]/div[1]/div[2]/h2[1]/a")
    WebElement nokiaLumia;

    //By nokiaLumia = By.xpath("//div[3]/div[1]/div[2]/h2[1]/a");
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Nokia Lumia 1020']")
    WebElement nokiaLumiaText;

    //By nokiaLumiaText = By.xpath("//h1[text()='Nokia Lumia 1020']");
    @CacheLookup
    @FindBy(id = "price-value-20")
    WebElement price;

    //By price = By.id("price-value-20");
    @CacheLookup
    @FindBy(name = "addtocart_20.EnteredQuantity")
    WebElement changeQuantity;

    // By changeQuantity = By.name("addtocart_20.EnteredQuantity");
    @CacheLookup
    @FindBy(id = "add-to-cart-button-20")
    WebElement addToCart;

    //By addToCart = By.id("add-to-cart-button-20");
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement productAddedInShoppingCart;

    // By productAddedInShoppingCart = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeButton;

    //By closeButton = By.xpath("//span[@title='Close']");
    @CacheLookup
    @FindBy(xpath = "//span[text()='Shopping cart']")
    WebElement hoverOnShoppingCart;
    //By hoverOnShoppingCart = By.xpath("//span[text()='Shopping cart']");
    @CacheLookup
    @FindBy(xpath = "//button[text()='Go to cart']")
    WebElement clickGoToCart;

    // By clickGoToCart = By.xpath("//button[text()='Go to cart']");
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Shopping cart']")
    WebElement shoppingCartText;

    //By shoppingCartText = By.xpath("//h1[text()='Shopping cart']");
    @CacheLookup
    @FindBy(xpath = "//input[@name='itemquantity11238' and @value='2']")
    WebElement checkQuantity;

    //By checkQuantity = By.xpath("//input[@name='itemquantity11238' and @value='2']");
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
    WebElement checkTotal;

    // By checkTotal = By.xpath("//tbody/tr[1]/td[6]/span[1]");
  //  @CacheLookup
    @FindBy(id="termsofservice")
    WebElement checkboxterm;


    // By checkbox = By.id("termsofservice");
    @FindBy(id = "checkout")
    WebElement checkout;

    //By checkout = By.id("checkout");
    @FindBy(xpath = "//h1[text()='Welcome, Please Sign In!']")
    WebElement checkWelcomeMessage;

    //By checkWelcomeMessage = By.xpath("//h1[text()='Welcome, Please Sign In!']");

    @CacheLookup
    @FindBy(xpath = "//button[text()='Register']")
    WebElement register;

    //By register = By.xpath("//button[text()='Register']");
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Register']")
    WebElement checkRegisterText;

    //By checkRegisterText = By.xpath("//h1[text()='Register']");
    @CacheLookup
    @FindBy(id = "gender-male")
    WebElement gender;

    //By gender = By.id("gender-male");
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstName;
    // By firstName = By.id("FirstName");

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastName;

    //By lastName = By.id("LastName");
    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement day;

    //By day = By.name("DateOfBirthDay");
    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement month;
    //By month = By.name("DateOfBirthMonth");
    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement year;
    //By year = By.name("DateOfBirthYear");
    @CacheLookup
    @FindBy(id = "Email")
    WebElement email;
    //By email = By.id("Email");
    @CacheLookup
    @FindBy(id = "Password")
    WebElement password;

    //By password = By.id("Password");
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;
    //By confirmPassword = By.id("ConfirmPassword");
    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;

    //By registerButton = By.id("register-button");
    @CacheLookup
    @FindBy(xpath = "//div[text()='Your registration completed']")
    WebElement checkRegistrationText;
    // By checkRegistrationText = By.xpath("//div[text()='Your registration completed']");
    @CacheLookup
    @FindBy(xpath = "//a[text()='Continue']")
    WebElement continueTab;

    //By continueTab = By.xpath("//a[text()='Continue']");
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Shopping cart']")
    WebElement checkShoppingCartText;
    //By checkShoppingCartText = By.xpath("//h1[text()='Shopping cart']");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement country;
    //By country = By.id("BillingNewAddress_CountryId");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement city;
    // By city = By.id("BillingNewAddress_City");

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address;
    //By address = By.id("BillingNewAddress_Address1");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postCode;
    //By postCode = By.id("BillingNewAddress_ZipPostalCode");
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber;

    // By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    @CacheLookup
    @FindBy(xpath = "//div/button[4]")
    WebElement continueButton;
    //By continueButton = By.xpath("//div/button[4]");
    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement on2ndDayAir;
    // By on2ndDayAir = By.id("shippingoption_2");
    @CacheLookup
    @FindBy(xpath = "//form/div[2]/button[1]")
    WebElement clickContinue;
    // By clickContinue = By.xpath("//form/div[2]/button[1]");
    @CacheLookup
    @FindBy(id = "paymentmethod_1")
    WebElement creditCardRadioButton;
    // By creditCardRadioButton = By.id("paymentmethod_1");
    @CacheLookup
    @FindBy(xpath = "//li[4]/div[2]/div[1]/button[1]")
    WebElement clickCon;
    // By clickCon = By.xpath("//li[4]/div[2]/div[1]/button[1]");
    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement visa;

    // By visa = By.id("CreditCardType");
    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardholderName;
    // By cardholderName = By.id("CardholderName");
    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;

    //By cardNumber = By.id("CardNumber");
    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement expireMonth;
    //By expireMonth = By.id("ExpireMonth");
    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement expireYear;
    // By expireYear = By.id("ExpireYear");
    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCode;
    //By cardCode = By.id("CardCode");
    @CacheLookup
    @FindBy(xpath = "//li[5]/div[2]/div[1]/button[1]")
    WebElement clickConBtn;
    // By clickConBtn = By.xpath("//li[5]/div[2]/div[1]/button[1]");
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement checkCreditCardText;

    //By checkCreditCardText = By.xpath("//span[contains(text(),'Credit Card')]");
    @CacheLookup
    @FindBy(xpath = "//div[2]/div[2]/ul[1]/li[1]/span[2]")
    WebElement check2ndDayAirText;

    //    By check2ndDayAirText = By.xpath("//div[2]/div[2]/ul[1]/li[1]/span[2]");
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
    WebElement checkLastTotal;
    //By checkLastTotal = By.xpath("//tbody/tr[1]/td[6]/span[1]");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirmButton;

    //By confirmButton = By.xpath("//button[contains(text(),'Confirm')]");
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement checkThankYouText;
    //By checkThankYouText = By.xpath("//h1[contains(text(),'Thank you')]");
    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement successfullyMessage;
    //By successfullyMessage = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement clickOnContinue;
    // By clickOnContinue = By.xpath("//button[contains(text(),'Continue')]");
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeToOurStoreMessage;
    //By welcomeToOurStoreMessage = By.xpath("//h2[contains(text(),'Welcome to our store')]");
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logoutLink;
    //By logoutLink = By.xpath("//a[contains(text(),'Log out')]");


    public void mouseHoverOnElectronicMenu() {

        Reporter.log("mouseHoverOnElectronicMenu: " + mouseHoverElectronic.toString());
        mouseHoverToElement(mouseHoverElectronic);
    }

    public void clickOnCellPhone() {
        Reporter.log("clickOnCellPhone: " + clickOnCellphone.toString());
        clickOnElement(clickOnCellphone);
    }

    public String getActualTextCellPhone() {

        Reporter.log("getActualTextCellPhone: " + verifyActualTextCellPhone.toString());
        return getTextFromElement(verifyActualTextCellPhone);
    }

    public void clickOnListViewTab() {
        Reporter.log("clickOnListViewTab: " + listViewTab.toString());

        clickOnElement(listViewTab);
    }

    public void clickOnNokiaLumiaProduct() {
        Reporter.log("clickOnNokiaLumiaProduct: " + nokiaLumia.toString());
        clickOnElement(nokiaLumia);
    }

    public String verifyNokiaLumiaText() {
        Reporter.log("verifyNokiaLumiaText: " + nokiaLumiaText.toString());

        return getTextFromElement(nokiaLumiaText);
    }

    public String verifyPrice() {
        Reporter.log("verifyPrice: " + price.toString());
        return getTextFromElement(price);
    }

    public void changeTheQuantity() {
        Reporter.log("changeTheQuantity: " + changeQuantity.toString());
        changeQuantity.clear();
        sendTextToElement(changeQuantity, "2");
    }

    public void clickOnAddToCartButton() {
        Reporter.log("clickOnAddToCartButton: " + addToCart.toString());
        clickOnElement(addToCart);
    }

    public String verifyProductAddedInShoppingCartText() {
        Reporter.log("verifyProductAddedInShoppingCartText: " + productAddedInShoppingCart.toString());
        return getTextFromElement(productAddedInShoppingCart);
    }

    public void clickOnCloseButton() {
        Reporter.log("clickOnCloseButton: " + closeButton.toString());
        clickOnElement(closeButton);
    }

    public void hoverOnShoppingCartAndClickOnGoToCartButton() {
        Reporter.log("hoverOnShoppingCart: " + hoverOnShoppingCart.toString());
        Reporter.log("ClickOnGoToCartButton: " + clickGoToCart.toString());
        mouseHoverToElement(hoverOnShoppingCart);
        clickOnElement(clickGoToCart);
    }
    public String verifyShoppingCartText() {
        Reporter.log("verifyShoppingCartText: " + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }

    public String verifyTheQuantity() {
        Reporter.log("verifyTheQuantity: " + checkQuantity.toString());
        return getTextFromElement(checkQuantity);
    }

    public String verifyTheTotal() {
        Reporter.log("verifyTheTotal: " + checkTotal.toString());
        return getTextFromElement(checkTotal);
    }

    public void clickOnCheckBox() throws InterruptedException {
      Reporter.log("clickOnCheckBox: " + checkboxterm.toString());
      Thread.sleep(2000);
      clickOnElement(checkboxterm);
    }


    public void clickOnCheckoutButton() {
        Reporter.log("clickOnCheckoutButton: " + checkout.toString());
        clickOnElement(checkout);
    }

    public String verifyWelcomeMessage() {
        Reporter.log("verifyWelcomeMessage: " + checkWelcomeMessage.toString());
        return getTextFromElement(checkWelcomeMessage);
    }

    public void clickOnRegisterTab() {
        Reporter.log("clickOnRegisterTab: " + register.toString());
        clickOnElement(register);
    }

    public String verifyRegisterText() {
        Reporter.log("verifyRegisterText: " + checkRegisterText.toString());
        return getTextFromElement(checkRegisterText);
    }

    public void mandatoryFields() {

        Reporter.log("Gender: " + gender.toString());
        clickOnElement(gender);

        Reporter.log("firstName: " + firstName.toString());
        sendTextToElement(firstName, "Mike");

        Reporter.log("lastName: " + lastName.toString());
        sendTextToElement(lastName, "Tyson");

        Reporter.log("Day: " + day.toString());
        selectByVisibleTextFromDropDown(day, "2");

        Reporter.log("Month: " + month.toString());
        selectByVisibleTextFromDropDown(month, "May");

        Reporter.log("year: " + year.toString());
        selectByVisibleTextFromDropDown(year, "1996");

        Reporter.log("Email: " + email.toString());
        sendTextToElement(email, getRandomString(6) + "@gmail.com");

        Reporter.log("password: " + password.toString());
        sendTextToElement(password, "test123");

        Reporter.log("confirmPassword: " + confirmPassword.toString());
        sendTextToElement(confirmPassword, "test123");
    }

    public void clickOnRegistrationButton() {
        Reporter.log("password: " + password.toString());
        clickOnElement(registerButton);
    }

    public String verifyRegistrationText() {
        Reporter.log("password: " + password.toString());
        return getTextFromElement(checkRegistrationText);
    }

    public void clickOnContinueTab() {
        Reporter.log("clickOnContinueTab: " + continueTab.toString());
        clickOnElement(continueTab);
    }

    public String checkShoppingCartText() {
        Reporter.log("checkShoppingCartText: " + checkShoppingCartText.toString());
        return getTextFromElement(checkShoppingCartText);
    }

    public void fillDeliveryAddressFields() {

        Reporter.log("Country: " + country.toString());
        selectByVisibleTextFromDropDown(country, "United Kingdom");
        Reporter.log("city: " + city.toString());
        sendTextToElement(city, "London");
        Reporter.log("address: " + address.toString());
        sendTextToElement(address, "1065A, London road");
        Reporter.log("postCode: " + postCode.toString());
        sendTextToElement(postCode, "CR76JG");
        Reporter.log("phoneNumber: " + phoneNumber.toString());
        sendTextToElement(phoneNumber, "07404835155");
    }

    public void clickOnContinueButton() {

        Reporter.log("clickOnContinueButton: " + continueButton.toString());
        clickOnElement(continueButton);
    }

    public void clickOn2ndDayAirButton() {

        Reporter.log("clickOn2ndDayAirButton: " + on2ndDayAir.toString());
        clickOnElement(on2ndDayAir);
    }

    public void clickContinue() {

        Reporter.log("clickContinue: " + clickContinue.toString());
        clickOnElement(clickContinue);
    }

    public void selectCreditCardRadioButton() {
        Reporter.log("selectCreditCardRadioButton: " + creditCardRadioButton.toString());
        clickOnElement(creditCardRadioButton);
    }

    public void clickCon() {
        Reporter.log("click on: " + clickCon.toString());
        clickOnElement(clickCon);
    }

    public void selectVisaFromDropDown() {
        Reporter.log("selectVisaFromDropDown: " + visa.toString());
        selectByVisibleTextFromDropDown(visa, "Visa");
    }

    public void fillCardDetails() {
        Reporter.log("cardholderName: " + cardholderName.toString());
        sendTextToElement(cardholderName, "Mike Tyson");

        Reporter.log("cardNumber: " + cardNumber.toString());
        sendTextToElement(cardNumber, "4222222222222");

        Reporter.log("expireMonth: " + expireMonth.toString());
        selectByVisibleTextFromDropDown(expireMonth, "02");

        Reporter.log("expireYear: " + expireYear.toString());
        selectByVisibleTextFromDropDown(expireYear, "2024");

        Reporter.log("cardCode: " + cardCode.toString());
        sendTextToElement(cardCode, "219");
    }

    public void clickConBtn() {
        Reporter.log("clickConBtn: " + clickConBtn.toString());
        clickOnElement(clickConBtn);
    }

    public String verifyCreditCardText() {
        Reporter.log("verifyCreditCardText: " + checkCreditCardText.toString());
        return getTextFromElement(checkCreditCardText);
    }

    public String verify2ndDayAirText() {
        Reporter.log("verify2ndDayAirText: " + check2ndDayAirText.toString());
        return getTextFromElement(check2ndDayAirText);
    }

    public String verifyFinalTotal() {
        Reporter.log("verifyFinalTotal: " + checkLastTotal.toString());
        return getTextFromElement(checkLastTotal);
    }

    public void clickOnConfirmButton() {
        Reporter.log("clickOnConfirmButton: " + confirmButton.toString());
        clickOnElement(confirmButton);
    }

    public String verifyThankYouText() {
        Reporter.log("verifyThankYouText: " + checkThankYouText.toString());
        return getTextFromElement(checkThankYouText);
    }

    public String verifySuccessfullyProcessedMessage() {
        Reporter.log("verifySuccessfullyProcessedMessage: " + successfullyMessage.toString());
        return getTextFromElement(successfullyMessage);
    }

    public void clickOnContinue() {
        Reporter.log("clickOnContinue: " + clickOnContinue.toString());
        clickOnElement(clickOnContinue);
    }

    public String verifyWelcomeToOurStoreText() {
        Reporter.log("verifyWelcomeToOurStoreText: " + welcomeToOurStoreMessage.toString());
        return getTextFromElement(welcomeToOurStoreMessage);
    }

    public void clickOnLogoutLink() {
        Reporter.log("clickOnLogoutLink: " + logoutLink.toString());
        clickOnElement(logoutLink);
    }


}
