package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
    By firstNameTextBox = By.id("BillingNewAddress_FirstName");
    By lastNameTextBox = By.id("BillingNewAddress_LastName");
    By emailTextBox= By.id("BillingNewAddress_Email");
    By countryDropDown = By.id("BillingNewAddress_CountryId");
    By cityTextBox = By.id("BillingNewAddress_City");
    By address1TextBox = By.id("BillingNewAddress_Address1");
    By postalcodeTextBox = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumberTextBox = By.id("BillingNewAddress_PhoneNumber");
    By continueButton = By.xpath("//button[@onclick='Billing.save()']");
    By nextDayAirRadioButton = By.id("shippingoption_1");
    By continueButton1 = By.xpath("//button[@onclick='ShippingMethod.save()']");
    By creditCard = By.id("paymentmethod_1");
    By paymentContinueButton = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By creditCardDropDown = By.id("CreditCardType");

    By cardHolderName= By.xpath("//input[@id='CardholderName']");
    By cardNumber= By.xpath("//input[@id='CardNumber']");
    By expiryMonthDropDown= By.xpath("//select[@id='ExpireMonth']");
    By expiryYearDropDown= By.xpath("//select[@id='ExpireYear']");
    By cardCode = By.xpath("//input[@id='CardCode']");
    By continueButton2 = By.xpath("(//button[@class='button-1 payment-info-next-step-button'])[1]");
    By creditCardText = By.xpath("//span[contains(text(),'Credit Card')]");
    By nextDayAirText = By.xpath("//span[contains(text(),'Next Day Air')]");
    By TotalAmountText = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$2,950.00')]");
    By confirmButton = By.xpath("//button[contains(text(),'Confirm')]");
    By thankYouText = By.xpath("//h1[contains(text(),'Thank you')]");
    By orderProcess = By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
    By continueButton3 = By.xpath("//button[contains(text(),'Continue')]");
    By secondDayAirRadioButton = By.id("shippingoption_2");
    By secondDayAirText = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]");
    By totalAmountNokiaText = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");

    public void enterFirstName(String name){
        sendTextToElement(firstNameTextBox,name);
    }

    public void enterLastName(String name){
        sendTextToElement(lastNameTextBox,name);
    }
    public void enterEmail(String email){
        sendTextToElement(emailTextBox,email);
    }
    public void enterCountryName(String name){
        selectByVisibleTextFromDropDown(countryDropDown,name);
    }

    public void enterCityName(String name){
        sendTextToElement(cityTextBox,name);
    }

    public void enterAddress1(String address){
        sendTextToElement(address1TextBox,address);
    }
    public void enterPostalCode(String postcode){
        sendTextToElement(postalcodeTextBox,postcode);
    }
    public void enterPhoneNumber(String number){
        sendTextToElement(phoneNumberTextBox,number);
    }

    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }

    public void clickOnNextDayAirRadioButton(){
        clickOnElement(nextDayAirRadioButton);
    }

    public void clickOnContinueButton1(){
        clickOnElement(continueButton1);
    }
    public void clickOnCreditCard(){
        clickOnElement(creditCard);
    }

    public void clickOnPaymentContinueButton(){
        clickOnElement(paymentContinueButton);
    }

    public void enterCreditCard(String card){
        selectByVisibleTextFromDropDown(creditCardDropDown,card);
    }

    public void enterCardHolderName(String name){
        sendTextToElement(cardHolderName,name);
    }


    public void enterCardNumber(String card){
        sendTextToElement(cardNumber,card);
    }

    public void enterExpiryMonth(String month){
        selectByVisibleTextFromDropDown(expiryMonthDropDown,month);
    }

    public void enterExpiryYear(String expiryYear){
        selectByVisibleTextFromDropDown(expiryYearDropDown,expiryYear);
    }


    public void enterCardCode(String cvc){
        sendTextToElement(cardCode,cvc);
    }

    public void clickOnContinueButton2(){
        clickOnElement(continueButton2);
    }

    public String getCreditCardText() {
        return getTextFromElement(creditCardText);
    }

    public String getNextDayAirText() {
        return getTextFromElement(nextDayAirText);
    }

    public String getTotalAmountText() {
        return getTextFromElement(TotalAmountText);
    }

    public void clickConfirmButton() {
        clickOnElement(confirmButton);
    }

    public String getThankYouText() {
        return getTextFromElement(thankYouText);
    }

    public String getOrderProcessText() {
        return getTextFromElement(orderProcess);
    }

    public void clickOnContinueButton3() {
        clickOnElement(continueButton3);
    }

    public void clickOnSecondDayAirRadioButton(){
        clickOnElement(secondDayAirRadioButton);
    }

    public String getsecondDayAirText() {
        return getTextFromElement(secondDayAirText);
    }
    public String getTotalAmountNokiaText(){
        return getTextFromElement(totalAmountNokiaText);
    }
}

