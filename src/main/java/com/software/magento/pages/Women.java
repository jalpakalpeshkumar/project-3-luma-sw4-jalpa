package com.software.magento.pages;

import com.software.magento.utilities.Utility;
import org.openqa.selenium.By;

public class Women extends Utility {


    By womenMenu = By.xpath("//span[normalize-space()='Women']");
    By tops = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By jacket = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    By selectProductName = By.xpath("//select[@id='sorter'])[1]");
    By verifyText = By.xpath("//strong[@class='product name product-item-name']//a");
    By selectPrice = By.xpath("//select[@id='sorter'])[1]");





    public void mouseHoverOnWomen(){
        mouseHoverToElement(womenMenu);
    }

    public void mouseHoverOnTops(){
        mouseHoverToElement(tops);
    }

    public void clickOnJacket(){
        mouseHoverToElementAndClick(jacket);

    }

    public void FilterProductName(){
        selectByVisibleTextFromDropDown(selectProductName, "Product Name");
    }

    public   verifyTheProductName(){
        return getTextFromElement(verifyText);
    }

    public void filterPrice(){
        selectByVisibleTextFromDropDown(selectPrice,"Price");
    }



}



