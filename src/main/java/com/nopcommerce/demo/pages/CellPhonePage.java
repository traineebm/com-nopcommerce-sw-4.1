package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CellPhonePage extends Utility {

    By cellPhoneText = By.xpath("//h1[contains(text(),'Cell phones')]");
    By listViewLink = By.xpath("//a[contains(text(),'List')]");
    By nokiaLumia1020Link = By.xpath("//a[contains(text(),'Nokia Lumia 1020')]");


    public String getCellPhoneText(){
       return getTextFromElement(cellPhoneText);
    }

    public void clickOnListViewLink(){
        clickOnElement(listViewLink);
    }
    public void clickOnNokiaLumia1020Link(){
        clickOnElement(nokiaLumia1020Link);
    }

}
