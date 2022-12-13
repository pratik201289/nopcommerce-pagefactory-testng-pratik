package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class TopMenu extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    public void selectMenu(String menu) {
        String mainMenu = menu.toLowerCase();
        String expression = "//a[@href ='/" + mainMenu + "']";
        driver.findElement(By.xpath(expression)).click();
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, baseUrl + menu, "Navigated successfully");
    }

    @CacheLookup
    @FindBy(xpath = "//a[@href='/computers']")
    WebElement MouseHoverComputer;
    // By MouseHoverComputer =By.xpath("//a[@href='/computers']");

    @CacheLookup
    @FindBy(xpath = "//a[@href='/electronics']")
    WebElement MouseHoverElectronic;

    // By MouseHoverElectronic =By.xpath("//a[@href='/electronics']");
    @CacheLookup
    @FindBy(xpath = "//a[@href='/apparel']")
    WebElement MouseHoverApparel;

    //By MouseHoverApparel =By.xpath("//a[@href='/apparel']");
    @CacheLookup
    @FindBy(xpath = "//a[@href='/digital-downloads']")
    WebElement MouseHoverDigitalDownloads;
    //By MouseHoverDigitalDownloads = By.xpath("//a[@href='/digital-downloads']");

    @CacheLookup
    @FindBy(xpath = "//a[@href='/books']")
    WebElement MouseHoverBooks;
    // By MouseHoverBooks = By.xpath("//a[@href='/books']");
    @CacheLookup
    @FindBy(xpath = "//a[@href='/jewelry']")
    WebElement MouseHoverJewerely;

    // By MouseHoverJewerely = By.xpath("//a[@href='/jewelry']");
    @CacheLookup
    @FindBy(xpath = "//a[@href='/gift-cards']")
    WebElement MouseHoverGiftCards;
    //By MouseHoverGiftCards = By.xpath("//a[@href='/gift-cards']");


    public void MouseHoveringComputer() {
        Reporter.log("Mouse Hover Computer Tab:" + MouseHoverComputer.toString());
        mouseHoverToElement(MouseHoverComputer);

    }

    public void MouseHoveringElectronic() {
        Reporter.log("Mouse Hover Electronic Tab:" + MouseHoverComputer.toString());
        mouseHoverToElement(MouseHoverElectronic);
    }

    public void MouseHoveringApparel() {
        Reporter.log("Mouse Hover Apparel Tab:" + MouseHoverApparel.toString());
        mouseHoverToElement(MouseHoverApparel);
    }

    public void MouseHoveringDigitalDownload() {
        Reporter.log("Mouse Hover Digital Download Tab:" + MouseHoverDigitalDownloads.toString());
        mouseHoverToElement(MouseHoverDigitalDownloads);
    }

    public void MouseHoveringBooks() {
        Reporter.log("Mouse Hover Books Tab:" + MouseHoverBooks.toString());
        mouseHoverToElement(MouseHoverBooks);
    }

    public void MouseHoveringJewellery() {
        Reporter.log("Mouse Hover Jewelry Tab:" + MouseHoverJewerely.toString());
        mouseHoverToElement(MouseHoverJewerely);
    }

    public void MouseHoveringGiftCards() {
        Reporter.log("Mouse Hover Gift Card Tab:" + MouseHoverGiftCards.toString());
        mouseHoverToElement(MouseHoverGiftCards);
    }

}
