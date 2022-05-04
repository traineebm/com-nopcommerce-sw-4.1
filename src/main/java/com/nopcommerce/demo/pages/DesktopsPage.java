package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class DesktopsPage extends Utility {
    By sortBy = By.name("products-orderby");
    By priceLowToHighText = By.xpath("//option[contains(text(),'Price: Low to High')]");
    By addToCartButton = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");



    public void clickOnSortByPriceLowToHigh(){
        selectByVisibleTextFromDropDown(sortBy, "Price: Low to High");
    }

    public String getPriceLowToHighDropDownText(){
       return getTextFromElement(priceLowToHighText);
    }

    public void clickOnSortByAToZ(){
        selectByVisibleTextFromDropDown(sortBy,"Name: A to Z");
    }

    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
    }


}
