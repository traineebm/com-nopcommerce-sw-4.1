package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePg = new HomePage();

    @Test
    public void verifyPageNavigationToComputersPageAndVerifyText(){
        homePg.selectTopMenuTab("Computers");
        String actualMessage = homePg.getTextFromComputers();
        Assert.assertEquals(actualMessage,"Computers", "Error message");
    }

    @Test
    public void verifyPageNavigationToElectronicsPageAndVerifyText(){
        homePg.selectTopMenuTab("Electronics");
        String actualMessage = homePg.getTextFromElectronics();
        Assert.assertEquals(actualMessage,"Electronics", "Error message");
    }

    @Test
    public void verifyPageNavigationToApparelPageAndVerifyText(){
        homePg.selectTopMenuTab("Apparel");
        String actualMessage = homePg.getTextFromApparel();
        Assert.assertEquals(actualMessage,"Apparel", "Error message");
    }

    @Test
    public void verifyPageNavigationToDigitalDownloadsPageAndVerifyText(){
        homePg.selectTopMenuTab("Digital downloads");
        String actualMessage = homePg.getTextFromDigitalDownloads();
        Assert.assertEquals(actualMessage,"Digital downloads", "Error message");
    }

    @Test
    public void verifyPageNavigationToBooksPageAndVerifyText(){
        homePg.selectTopMenuTab("Books");
        String actualMessage = homePg.getTextFromBooks();
        Assert.assertEquals(actualMessage,"Books", "Error message");
    }

    @Test
    public void verifyPageNavigationToJewelryPageAndVerifyText(){
        homePg.selectTopMenuTab("Jewelry");
        String actualMessage = homePg.getTextFromJewelry();
        Assert.assertEquals(actualMessage,"Jewelry", "Error message");
    }

    @Test
    public void verifyPageNavigationToGiftCardsPageAndVerifyText(){
        homePg.selectTopMenuTab("Gift Cards");
        String actualMessage = homePg.getTextFromGiftCards();
        Assert.assertEquals(actualMessage,"Gift Cards", "Error message");
    }
}
