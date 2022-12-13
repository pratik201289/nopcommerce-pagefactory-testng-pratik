package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CartPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Shopping cart']")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement clearQuantity;
    @CacheLookup
    @FindBy(xpath = "//input[@value='1']")
    WebElement addQuantity;
    @CacheLookup
    @FindBy(id = "updatecart")
    WebElement updateCart;
    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
    WebElement total;
    @CacheLookup
    @FindBy(name = "termsofservice")
    WebElement checkBox;
    @CacheLookup
    @FindBy(id = "checkout")
    WebElement checkout;
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Welcome, Please Sign In!']")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 checkout-as-guest-button']")
    WebElement checkOutAsGuest;

    public String getShoppingCartText() {
        Reporter.log("Get shopping cart text" + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }

    public void changeQuantity() {
        Reporter.log("Change quantity" + addQuantity.toString());
        driver.findElement(By.xpath("//input[@value='1']")).clear();
        sendTextToElement(addQuantity, "2");
    }

    public void clickOnUpdateCart() {
        Reporter.log("Click on update cart" + updateCart.toString());
        clickOnElement(updateCart);
    }

    public String getTotal() {
        Reporter.log("Get total" + total.toString());
        return getTextFromElement(total);
    }

    public void clickOnCheckBox() {
        Reporter.log("Click on check box" + checkBox.toString());
        clickOnElement(checkBox);
    }

    public void clickOnCheckoutButton() {
        Reporter.log("Click on checkout button" + checkout.toString());
        clickOnElement(checkout);
    }

    public String getWelcomeText() {
        Reporter.log("Get welcome text" + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void clickOnCheckoutAsGuest() {
        Reporter.log("Click on checkout as guest" + checkOutAsGuest.toString());
        clickOnElement(checkOutAsGuest);
    }

}
