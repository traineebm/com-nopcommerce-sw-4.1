package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {
   // By TopMenuTab = By.xpath("By.xpath(//div[@class='header-menu']//li)");
    By Computers = By.xpath("//h1[contains(text(),'Computers')]");
    By Electronics = By.xpath("//h1[contains(text(),'Electronics')]");
    By Apparel = By.xpath("//h1[contains(text(),'Apparel')]");
    By Digitaldownloads = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']");
    By Books = By.xpath("//h1[contains(text(),'Books')]");
    By Jewelry = By.xpath("//h1[contains(text(),'Jewelry')]");
    By GiftCards = By.xpath("//h1[contains(text(),'Gift Cards')]");
    By computersLink = By.xpath("//a[@href='/computers']");
    By welcomeOurStore = By.xpath("//h2[contains(text(),'Welcome to our store')]");

    By electronicsLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By cellPhoneLink = By.xpath("//ul[@class='top-menu notmobile']//a[text()='Cell phones ']");

    By logOutButton = By.xpath("//a[contains(text(),'Log out')]");


    public void selectTopMenuTab(String menu) {

        List<WebElement> topMenuNames = driver.findElements(By.xpath("//div[@class='header-menu']//li"));
        for (WebElement names : topMenuNames) {
            if (names.getText().equalsIgnoreCase(menu)) {
                names.click();
                break;
            }
        }
    }

    public String getTextFromComputers(){
        return getTextFromElement(Computers);
    }

    public String getTextFromElectronics(){
        return getTextFromElement(Electronics);
    }

    public String getTextFromApparel(){
        return getTextFromElement(Apparel);
    }

    public String getTextFromDigitalDownloads(){
        return getTextFromElement(Digitaldownloads);
    }

    public String getTextFromBooks(){
        return getTextFromElement(Books);
    }

    public String getTextFromJewelry(){
        return getTextFromElement(Jewelry);
    }

    public String getTextFromGiftCards(){
        return getTextFromElement(GiftCards);
    }

    public void clickOnComputersLink(){
        clickOnElement(computersLink);
    }
    public String getWelcomeOurStoreText(){
        return getTextFromElement(welcomeOurStore);
    }

    public void mouseHoverOnElectronicsTab(){
        mouseHoverToElement(electronicsLink);
    }
    public void clickOnCellPhoneLink(){
        mouseHoverToElementAndClick(cellPhoneLink);
    }

    public void clickOnLogOutButton(){
        clickOnElement(logOutButton);
    }
}