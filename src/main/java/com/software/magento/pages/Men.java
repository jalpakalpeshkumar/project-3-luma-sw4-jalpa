package com.software.magento.pages;

import com.software.magento.utilities.Utility;
import org.openqa.selenium.By;

public class Men extends Utility {

    By menMEnu = By.xpath("//span[normalize-space()='Men']");
    By bottoms = By.xpath("//a[@id='ui-id-18']");
    By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By CronusYogaPant = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By size32 = By.xpath("(//div[@class='swatch-option text'])[1]");
    By colourBlack = By.xpath("(//div[@class='swatch-option color'])[1]");
    By addToCart = By.xpath("//span[contains(text(),'Add to Cart')])[1]");
    By verifyText = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    By verifyCronusYogaPant = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By verifySize32 = By.xpath("//dd[contains(text(),'32')]");
    By verifyColour = By.xpath("//dd[contains(text(),'Black')]");


    public void mouseHourOnMen(){
        mouseHoverToElement(menMEnu);
    }

    public void mouseHourOnBottoms(){
        mouseHoverToElement(bottoms);
    }

    public void clickOnPants(){
        mouseHoverToElementAndClick(pants);
    }

    public void mouseHourOnCronusYogaPant(){
        mouseHoverToElement(CronusYogaPant);
    }
    public void clickSize32(){
        mouseHoverToElementAndClick(size32);
    }
    public void clickColourBlack(){
        mouseHoverToElementAndClick(colourBlack);
    }
    public void ProductChooseToCart(){
        mouseHoverToElement(CronusYogaPant);
        mouseHoverToElementAndClick(addToCart);
    }
    public String checkVerifyText(){
       return getTextFromElement(verifyText);
    }

    public void clickOnShoppingCart(){
        clickOnElement(shoppingCart);
    }
    public String verifyTheProductNameCronusYogaPant(){
        return getTextFromElement(verifyCronusYogaPant);
    }
    public String verifyTheProductSize32(){
        return getTextFromElement(verifySize32);
    }
    public String verifyTheProductColour(){
        return getTextFromElement(verifyColour);
    }
}
