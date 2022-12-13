package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerMenu extends Utility {

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement clickComputerMenu;
    //By clickComputerMenu = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]")
    WebElement clickDesktopTab;
    //By clickDesktopTab = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]");
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement verifyZtoAList;
   // By verifyZtoAList = By.xpath("//select[@id='products-orderby']");

    public void clickOnComputerMenu() {
        Reporter.log("clickOnComputerMenu" +clickComputerMenu.toString());
        clickOnElement(clickComputerMenu);
    }

    public void clickOnDesktopMenu() {
        Reporter.log("clickDesktopTab" +clickDesktopTab.toString());
        clickOnElement(clickDesktopTab);
    }
    public void setSelectZtoAListDrop() {
        Reporter.log("setSelectZtoAListDrop" +verifyZtoAList.toString());
        selectByContainsTextFromDropDown(verifyZtoAList, "Name: Z to A");

    }


}
