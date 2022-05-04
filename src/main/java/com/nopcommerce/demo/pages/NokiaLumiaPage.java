package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class NokiaLumiaPage extends Utility {

    By nokiaLumia1020Text = By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]");
    By priceText = By.xpath("//span[contains(text(),'$349.00')]");
    By cartQuantityBox=By.xpath("//input[@value='1']");
    By addToCartButton=By.xpath("//button[@id='add-to-cart-button-20']");
    By productHasBeenAddedText = By.xpath("//body/div[@id='bar-notification']/div[1]");
    By greenCloseButton=By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
    By mouseHoverOnShoppingCart = By.xpath("//span[contains(text(),'Shopping cart')]");
    By goToCartButton = By.xpath("//button[contains(text(),'Go to cart')]");


    public String getNokiaLumia1020Text(){
        return getTextFromElement(nokiaLumia1020Text);
    }

    public String getPriceText(){
        return getTextFromElement(priceText);
    }

    public void updateQuantityBox(){
        sendTextToElement(cartQuantityBox, Keys.BACK_SPACE + "2");
    }

    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
    }

    public String getProductHasBeenAddedText(){
        return getTextFromElement(productHasBeenAddedText);
    }
    public void clickOnGreenButton(){
        clickOnElement(greenCloseButton);
    }
    public void mouserHoverOnShoppingCart(){
        mouseHoverToElement(mouseHoverOnShoppingCart);
    }
    public void clickOnGoToCartButton(){
        clickOnElement(goToCartButton);
    }

    public String getProductHasBeenAdded(){
        return getTextFromElement(productHasBeenAddedText);
    }


}
