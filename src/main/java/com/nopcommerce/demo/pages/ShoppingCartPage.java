package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


public class ShoppingCartPage extends Utility {
    By shoppingCartText = By.xpath("//h1[contains(text(),'Shopping cart')]");
    By quantity = By.xpath("//td[@class=\"quantity\"]/child::input");
    By updateShoppingCart = By.id("updatecart");
    By verifyTotal=By.xpath("//tbody/tr[1]/td[6]/span[1]");
    By termsOfServiceCheckBox=By.id("termsofservice");
    By checkOutButton=By.id("checkout");
    By verifyQuantity = By.xpath("//span[contains(text(),'(2)')]");
    By verifyTotal2 = By.xpath("//span[@class='value-summary']//strong[contains(text(),'$698.00')]");


    public String getShoppingCartText(){
        return getTextFromElement(shoppingCartText);
    }

    public void changeQuantity(){
        sendTextToElement(quantity,Keys.BACK_SPACE + "2");
    }

    public void clickOnUpdateCart(){
        clickOnElement(updateShoppingCart);
    }

    public String getTextFromVerifyTotal(){
        return getTextFromElement(verifyTotal);
    }

    public void clickOnTermsOfServiceCheckBox(){
        clickOnElement(termsOfServiceCheckBox);
    }

    public void clickOnCheckOutButton(){
        clickOnElement(checkOutButton);
    }

    public String getVerifyQuantity(){
        return getTextFromElement(verifyQuantity);
    }

    public String getVerifyTotalFromText(){
        return getTextFromElement(verifyTotal2);
    }
}
