package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputersPage extends Utility {
    By desktopCategory = By.xpath("//li[@class='inactive']//a[normalize-space()='Desktops']");

    public void clickOnDesktopCategory(){
        clickOnElement(desktopCategory);
    }


}
