package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.TopMenu;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class TopMenuTest extends BaseTest {
    TopMenu topMenu;

    @BeforeMethod(alwaysRun = true)
    public void inIT(){
        topMenu=new TopMenu();
    }

    @Test(groups = {"sanity", "regression"})
    public void verifyPageNavigation() {

        topMenu.MouseHoveringComputer();
        topMenu.selectMenu("computers");
        topMenu.MouseHoveringElectronic();
        topMenu.selectMenu("electronics");
        topMenu.MouseHoveringApparel();
        topMenu.selectMenu("apparel");
        topMenu.MouseHoveringDigitalDownload();
        topMenu.selectMenu("digital-downloads");
        topMenu.MouseHoveringBooks();
        topMenu.selectMenu("books");
        topMenu.MouseHoveringJewellery();
        topMenu.selectMenu("jewelry");
        topMenu.MouseHoveringGiftCards();
        topMenu.selectMenu("gift-cards");

    }


}
