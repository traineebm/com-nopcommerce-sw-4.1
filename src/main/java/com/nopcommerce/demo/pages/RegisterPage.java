package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By verifyRegisterText = By.xpath("//h1[contains(text(),'Register')]");
    By firstNameTextBox = By.id("FirstName");
    By lastNameTextBox = By.id("LastName");
    By emailTextBox = By.id("Email");
    By passwordTextBox = By.id("Password");
    By confirmPasswordTextBox = By.id("ConfirmPassword");
    By registerButton1 = By.id("register-button");
    By registerSuccess = By.xpath("//div[contains(text(),'Your registration completed')]");
    By continueButton3 = By.xpath("//a[contains(text(),'Continue')]");


    public String getVerifyRegisterText(){
        return getTextFromElement(verifyRegisterText);
    }

    public void enterFirstName(String firstName){
        sendTextToElement(firstNameTextBox,firstName);
    }
    public void enterLastName(String lastName){
        sendTextToElement(lastNameTextBox,lastName);
    }
    public void enterEmail(String email){
        sendTextToElement(emailTextBox,email);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordTextBox,password);
    }
    public void enterConfirmPassword(String confirmPassword){
        sendTextToElement(confirmPasswordTextBox,confirmPassword);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerButton1);
    }
    public String getRegisterSuccessText(){
        return getTextFromElement(registerSuccess);
    }
    public void clickOnContinueButton(){
        clickOnElement(continueButton3);
    }

}
