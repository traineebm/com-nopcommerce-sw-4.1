package com.nopcommerce.demo.testsuite;

import com.google.common.base.Verify;
import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputersTest extends TestBase {
    HomePage homePg = new HomePage();
    ComputersPage comPg = new ComputersPage();
    DesktopsPage desktopPg = new DesktopsPage();
    BuildYourOwnComputerPage buildYourOwnCompPg = new BuildYourOwnComputerPage();
    ShoppingCartPage shoppingCartPg = new ShoppingCartPage();
    LoginPage loginPg = new LoginPage();
    CheckOutPage checkOutPg = new CheckOutPage();

    @Test
    public void verifyProductArrangedInAscendingOrder(){
        homePg.clickOnComputersLink();
        comPg.clickOnDesktopCategory();
        desktopPg.clickOnSortByPriceLowToHigh();
        String actualMessage = desktopPg.getPriceLowToHighDropDownText();
        Assert.assertEquals(actualMessage,"Price: Low to High","Error message");
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessfully() throws InterruptedException {

        homePg.clickOnComputersLink();
        comPg.clickOnDesktopCategory();
        desktopPg.clickOnSortByAToZ();
        Thread.sleep(500);
        desktopPg.clickOnAddToCartButton();
        String actualMessage = buildYourOwnCompPg.getTextBuildYourOwnComputer();
        Assert.assertEquals(actualMessage,"Build your own computer","Error message");

        buildYourOwnCompPg.selectProcessor2_2GHzIntelPentiumDualCoreE2200();
        buildYourOwnCompPg.selectRAM8GB();
        buildYourOwnCompPg.selectHDDRadio400GB();
        buildYourOwnCompPg.selectOSRadioVistaPremium();
        Thread.sleep(1000);
       // buildYourOwnCompPg.selectCheckBoxMicrosoftOffice();
        buildYourOwnCompPg.selectCheckBoxTotalCommander();
        //2.11 Verify the price "$1,475.00"
        String actualPriceMessage = buildYourOwnCompPg.getPriceText();
        Assert.assertEquals(actualPriceMessage,"$1,475.00","Error message");
        //2.12 Click on "ADD TO CARD" Button.
        buildYourOwnCompPg.clickOnAddToCartButton();
        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String actualAddToCartMessage = buildYourOwnCompPg.verifyTheProductHasBeenAddedToYourShoppingCart();
        Assert.assertEquals(actualAddToCartMessage,"The product has been added to your shopping cart","Error message");
        //After that close the bar clicking on the cross button.
        buildYourOwnCompPg.closeTheBarByClickingOnTheCrossButton();
        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button
        buildYourOwnCompPg.mouseHoverOnShoppingCart();
        buildYourOwnCompPg.clickOnGoToCartButton();
        //2.15 Verify the message "Shopping cart"
        String actualShoppingCartMessage = shoppingCartPg.getShoppingCartText();
        Assert.assertEquals(actualShoppingCartMessage,"Shopping cart","Error message");

        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        Thread.sleep(1000);
        shoppingCartPg.changeQuantity();
        shoppingCartPg.clickOnUpdateCart();
        //2.17 Verify the Total"$2,950.00"
        String actualTotal = shoppingCartPg.getTextFromVerifyTotal();
        Assert.assertEquals(actualTotal,"$2,950.00","Error message");
        //2.18 click on checkbox “I agree with the terms of service”
        shoppingCartPg.clickOnTermsOfServiceCheckBox();
        //2.19 Click on “CHECKOUT”
        shoppingCartPg.clickOnCheckOutButton();
        //2.20 Verify the Text “Welcome, Please Sign In!”
        String actualWelcomeSignInText = loginPg.getWelcomePageSignInText();
        Assert.assertEquals(actualWelcomeSignInText,"Welcome, Please Sign In!","Error message");
        //2.21Click on “CHECKOUT AS GUEST” Tab
        loginPg.clickOnCheckOutAsGuestButton();
        //2.22 Fill the all mandatory field
        checkOutPg.enterFirstName("Munir");
        checkOutPg.enterLastName("Shah");
        checkOutPg.enterEmail("munirshah007@gmail.com");
        checkOutPg.enterCountryName("United Kingdom");
        checkOutPg.enterCityName("London");
        checkOutPg.enterAddress1("10 Grant Road");
        checkOutPg.enterPostalCode("WD24 4DX");
        checkOutPg.enterPhoneNumber("07707945997");
        //2.23 Click on “CONTINUE”
        checkOutPg.clickOnContinueButton();
        //2.24 Click on Radio Button “Next Day Air($0.00)”
        checkOutPg.clickOnNextDayAirRadioButton();
        //2.25 Click on “CONTINUE”
        checkOutPg.clickOnContinueButton1();

        checkOutPg.clickOnCreditCard();
        checkOutPg.clickOnPaymentContinueButton();
        checkOutPg.enterCreditCard("Master card");

        checkOutPg.enterCardHolderName("Mr Munir Shah");
        checkOutPg.enterCardNumber("5356 7890 4534 2345");
        checkOutPg.enterExpiryMonth("05");
        checkOutPg.enterExpiryYear("2025");
        checkOutPg.enterCardCode("345");
        checkOutPg.clickOnContinueButton2();

        String actualCardMessage = checkOutPg.getCreditCardText();
        Assert.assertEquals(actualCardMessage,"Credit Card","error");
        String actualNextDayAirMessage = checkOutPg.getNextDayAirText();
        Assert.assertEquals(actualNextDayAirMessage,"Next Day Air","error");
        String actualTotalMessage1 = checkOutPg.getTotalAmountText();
        Assert.assertEquals(actualTotalMessage1,"$2,950.00","error");
        checkOutPg.clickConfirmButton();
        String actualThankYouMessage = checkOutPg.getThankYouText();
        Assert.assertEquals(actualThankYouMessage,"Thank you","error");
        String actualOrderMessage = checkOutPg.getOrderProcessText();
        Assert.assertEquals(actualOrderMessage,"Your order has been successfully processed!","error");
        checkOutPg.clickOnContinueButton3();
        String actualWelcomeMessage = homePg.getWelcomeOurStoreText();
        Assert.assertEquals(actualWelcomeMessage,"Welcome to our store","error");
    }
}
