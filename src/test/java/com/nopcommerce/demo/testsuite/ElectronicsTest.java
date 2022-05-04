package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {
    HomePage homePg = new HomePage();
    CellPhonePage cellphonePg = new CellPhonePage();
    NokiaLumiaPage nokiaLumiaPg = new NokiaLumiaPage();
    ShoppingCartPage shoppingCartPg = new ShoppingCartPage();
    LoginPage loginPg = new LoginPage();
    RegisterPage regPg = new RegisterPage();
    CheckOutPage checkOutPg = new CheckOutPage();


    @Test
    public void textVerified(){
        homePg.mouseHoverOnElectronicsTab();
        homePg.clickOnCellPhoneLink();
        String actualCellPhoneText = cellphonePg.getCellPhoneText();
        Assert.assertEquals(actualCellPhoneText,"Cell phones","Error message");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        homePg.mouseHoverOnElectronicsTab();
        homePg.clickOnCellPhoneLink();
        String actualCellPhoneText = cellphonePg.getCellPhoneText();
        Assert.assertEquals(actualCellPhoneText,"Cell phones","Error message");

        cellphonePg.clickOnListViewLink();
        Thread.sleep(1000);
        cellphonePg.clickOnNokiaLumia1020Link();

        String actualNokiaLumia1020Text = nokiaLumiaPg.getNokiaLumia1020Text();
        Assert.assertEquals(actualNokiaLumia1020Text,"Nokia Lumia 1020","Error message");


        String actualPriceText = nokiaLumiaPg.getPriceText();
        Assert.assertEquals(actualPriceText,"$349.00","Error message");

       nokiaLumiaPg.updateQuantityBox();

       nokiaLumiaPg.clickOnAddToCartButton();

        String actualProductAddedToText = nokiaLumiaPg.getProductHasBeenAdded();
        Assert.assertEquals(actualProductAddedToText,"The product has been added to your shopping cart","Error message");

        nokiaLumiaPg.clickOnGreenButton();

        nokiaLumiaPg.mouserHoverOnShoppingCart();

        nokiaLumiaPg.clickOnGoToCartButton();

        shoppingCartPg.getShoppingCartText();

        String actualQuantityMessage = shoppingCartPg.getVerifyQuantity();
        Assert.assertEquals(actualQuantityMessage,"(2)","Error message");

        //2.14 Verify the Total $698.00
        shoppingCartPg.getVerifyTotalFromText();
        String actualTotalText = shoppingCartPg.getVerifyTotalFromText();
        Assert.assertEquals(actualTotalText,"$698.00","Error message");

        shoppingCartPg.clickOnTermsOfServiceCheckBox();


        shoppingCartPg.clickOnCheckOutButton();

        String actualWelcomeSignInText = loginPg.getWelcomePageSignInText();
        Assert.assertEquals(actualWelcomeSignInText,"Welcome, Please Sign In!","Error message");

        loginPg.clickOnRegisterButton();



        //regPg.clickOnRegisterButton();

        String actualRegisterMessage = regPg.getVerifyRegisterText();
        Assert.assertEquals(actualRegisterMessage,"Register","Error message");

        //2.20
        regPg.enterFirstName("Munir");
        regPg.enterLastName("Shah");
        regPg.enterEmail("munirshah12111@gmail.com");
        regPg.enterPassword("Asdfg234");
        regPg.enterConfirmPassword("Asdfg234");

        regPg.clickOnRegisterButton();

        String actualRegisterSuccessText = regPg.getRegisterSuccessText();
        Assert.assertEquals(actualRegisterSuccessText,"Your registration completed","Error message");

        //2.23
        regPg.clickOnContinueButton();

        shoppingCartPg.getShoppingCartText();

        shoppingCartPg.clickOnTermsOfServiceCheckBox();

        shoppingCartPg.clickOnCheckOutButton();

        //2.27
        //checkOutPg.enterFirstName("Munir");
        //checkOutPg.enterLastName("Shah");
       // checkOutPg.enterEmail("munir0070@gmail.com");
        checkOutPg.enterCountryName("United Kingdom");
        checkOutPg.enterCityName("London");
        checkOutPg.enterAddress1("10 Grant Road");
        checkOutPg.enterPostalCode("WD24 4DX");
        checkOutPg.enterPhoneNumber("02085678960");
        checkOutPg.clickOnContinueButton();

        checkOutPg.clickOnSecondDayAirRadioButton();

        checkOutPg.clickOnContinueButton1();

        checkOutPg.clickOnCreditCard();

        checkOutPg.clickOnPaymentContinueButton();

        checkOutPg.enterCreditCard("Visa");
        //2.33
        checkOutPg.enterCardHolderName("Mr Munir Shah");
        checkOutPg.enterCardNumber("5356 6548 1418 5420");
        checkOutPg.enterExpiryMonth("11");
        checkOutPg.enterExpiryYear("2025");
        checkOutPg.enterCardCode("345");
        checkOutPg.clickOnContinueButton2();

        String actualCreditCardText = checkOutPg.getCreditCardText();
        Assert.assertEquals(actualCreditCardText,"Credit Card","Error message");

        //2.36
        String actualsecondDayAirText = checkOutPg.getsecondDayAirText();
        Assert.assertEquals(actualsecondDayAirText,"Shipping Method: 2nd Day Air","Error message");

        String totalAmountNokiaText = checkOutPg.getTotalAmountNokiaText();
        Assert.assertEquals(totalAmountNokiaText,"$698.00","Error message");

        checkOutPg.clickConfirmButton();
        //2.39
        String actualThankYouText = checkOutPg.getThankYouText();
        Assert.assertEquals(actualThankYouText,"Thank you","Error message");

        //2.40
        String actualOrderProcessMessage = checkOutPg.getOrderProcessText();
        Assert.assertEquals(actualOrderProcessMessage,"Your order has been successfully processed!","Error message");
        //2.41
        checkOutPg.clickOnContinueButton3();
        //2.42
        String actualWelcomeToOurStore = homePg.getWelcomeOurStoreText();
        Assert.assertEquals(actualWelcomeToOurStore,"Welcome to our store","Error message");

        //2.43
        homePg.clickOnLogOutButton();

        //2.44
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL,"https://demo.nopcommerce.com/","Error message");

    }

}
