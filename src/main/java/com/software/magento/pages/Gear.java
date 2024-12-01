package com.software.magento.pages;

import com.software.magento.utilities.Utility;
import org.openqa.selenium.By;

public class Gear extends Utility {

    By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    By bag  = By.xpath("//span[normalize-space()='Bags']");
    By OvernightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By Qty3 =By.xpath("//input[@id='qty']");
    By addToCart = By.xpath("//button[@id='product-addtocart-button']");
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    By Qty5 = By.xpath("//input[@class='input-text qty'])[1]");
    By updateShoppingCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    By verifyOvernightDuffle = By.xpath("//span[@class='base']");
    By verifyText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By verifyTheProductName = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By verifyTheQty =By.xpath("//input[@title='Qty']\"), \"value");
    By verifyPrice = By.xpath("//span[@class='cart-price']//span)[2]");



    public void mouseHourOnGearMenu(){
        mouseHoverToElement(gearMenu);
    }

    public void clickToBag(){
        mouseHoverToElementAndClick(bag);
    }
    public void clickOnProductNameOverNightDuffle(){
        clickOnElement(OvernightDuffle);
    }

    public void changeQty3(){
        sendTextToElement(Qty3,"3");
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public void clickOnShoppingCart(){
        clickOnElement(shoppingCart);
    }
    public void changeQty5(){
        sendTextToElement(Qty5,"5");
    }
    public void clickOnUpdateShoppingCart(){
        clickOnElement(updateShoppingCart);
    }
    public String verifyTheTextOvernightDuffle(){
        return getTextFromElement(verifyOvernightDuffle);
    }
    public String verifyTheText(){
        return getTextFromElement(verifyText);
    }
    public String verifyTheProductNameOvernightDuffle(){
        return getTextFromElement(verifyTheProductName);
    }
    public String verifyTheQtyIs3(){
        return getTextFromElement(verifyTheQty);
    }
    public String verifyTheProductPrice(){
        return getTextFromElement(verifyPrice);
    }
}
